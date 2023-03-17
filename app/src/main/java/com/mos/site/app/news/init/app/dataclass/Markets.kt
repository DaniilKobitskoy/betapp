package com.mos.site.app.news.init.app.dataclass

data class Markets(
    val bothToScore: BothToScore,
    val half: Half,
    val handicaps1: List<Handicaps1>,
    val totals: List<Total>,
    val totals1: List<Totals1>,
    val totals1Asian: List<Totals1Asian>,
    val totals2: List<Totals2>,
    val totals2Asian: List<Totals2Asian>,
    val totalsAsian: List<TotalsAsian>,
    val win1: Win1,
    val win12: Win1,
    val win1X: Win1,
    val win2: Win1,
    val winX: Win1,
    val winX2: Win1
)