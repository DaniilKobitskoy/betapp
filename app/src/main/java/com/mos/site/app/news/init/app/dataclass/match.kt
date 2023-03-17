package com.mos.site.app.news.init.app.dataclass

data class match(
    val actual_at: String,
    val country: String,
    val date_start: String,
    val half_order_index: Int,
    val hash: String,
    val href: String,
    val id: Int,
    val isComposite: Boolean,
    val isLive: Boolean,
    val isSpecial: Boolean,
    val league: LeagueX,
    val markets: Markets,
    val minute: Int,
    val score1: Int,
    val score2: Int,
    val seconds: Int,
    val stats: StatsX,
    val team1: String,
    val team1_id: Int,
    val team1_rus: String,
    val team2: String,
    val team2_id: Int,
    val team2_rus: String,
    val title: String,
    val v: Int
)