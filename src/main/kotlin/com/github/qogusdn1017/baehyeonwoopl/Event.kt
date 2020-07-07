package com.github.qogusdn1017.baehyeonwoopl

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.player.PlayerJoinEvent

class Event : Listener {
    @EventHandler
    fun onBreak(e: BlockBreakEvent) {
        val p = e.player
        run {
            e.isCancelled = !p.isOp
        }
    }

    @EventHandler
    fun onPlace(e: BlockPlaceEvent) {
        val p = e.player
        run {
            e.isCancelled = !p.isOp
        }
    }

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        val p = e.player
        p.sendMessage(ChatColor.DARK_GREEN.toString() + "Welcome to HyeonWoo Server!")
        p.sendTitle(
            ChatColor.GOLD.toString() + "" + e.player.name,
            ChatColor.GREEN.toString() + "Welcome :)",
            1,
            150,
            1
        )
    }
}