package net.torosamy.torosamyScript.listener

import net.torosamy.torosamyScript.utils.CommandUtil
import net.torosamy.torosamyScript.utils.ConfigUtil
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinEventListener : Listener {
    @EventHandler
    fun playerOnJoin(event: PlayerJoinEvent) {
        if (!ConfigUtil.mainConfig.joinEvent.enabled) return
        for (action in ConfigUtil.mainConfig.joinEvent.actions) {
            if(!CommandUtil.getCommand(event.player,action)) return
        }
    }
}