<?php

/* Liens Stackoverflow
 * https://stackoverflow.com/questions/51003775/a-non-well-formed-numeric-value-encountered-error-in-php
 */

define('FILENUM', 3);

$input = file_get_contents('../exercices/BattleDev S11 - Mars 2018/Exercice 2 - Buffet a volonte/input' . FILENUM . '.txt');
$rows = explode("\n", $input);

$price = $rows[0];
$dailyTotal = 0;

for ($i = 2, $n = sizeof($rows); $i < $n; $i++) {
    $nbPers = $rows[$i];

    /* Version factorisée */
    //$total += ($nbPers >= 10) ? (float)$price * (float)$nbPers * 0.7 : (($nbPers >= 6) ? (float)$price * (float)$nbPers * 0.8 : (($nbPers >= 4) ? (float)$price * (float)$nbPers * 0.9 : (float)$price * (float)$nbPers));

    /* Version longue */
    if ($nbPers >= 10)
        $total = (float) $price * (float) $nbPers * 0.7;
    else if ($nbPers >= 6)
        $total = (float) $price * (float) $nbPers * 0.8;
    else if ($nbPers >= 4)
        $total = (float) $price * (float) $nbPers * 0.9;
    else
        $total = (float) $price * (float) $nbPers;
    $dailyTotal += $total;
}
// echo "Le total du jour est de : " . ceil($total);
echo "Le total du jour est de : " . ceil($dailyTotal);





