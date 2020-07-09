package com.github.qogusdn1017.baehyeonwoopl

import org.bukkit.*
import org.bukkit.command.TabCompleter
import org.bukkit.attribute.Attribute
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import java.util.*

/*
/
/ @author BaeHyeonWoo
/
/ Full Directing, Original Author of this code is BaeHyeonWoo ; with help and idea from HappyAndJust and B1ackAnge1.
/
/ I'll add Special thanks at here if someone reports bug or gives me idea.
/
/ Special Thanks : SABOyoutube (For Idea of Skull Command.)
/
 */

class Main : JavaPlugin() {
    private var hashMap = HashMap<String, GameMode>()
    override fun onEnable() {
        println("BaeHyeonWoo PL.\n===============\nv1.4")
        Bukkit.getPluginManager().registerEvents(Event(), this)
    }

    override fun onDisable() {
        println("Plugin Disabled.")
    }

    @Override override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<String>): Boolean {
        hashMap["Survival"] = GameMode.SURVIVAL
        hashMap["Creative"] = GameMode.CREATIVE
        hashMap["Adventure"] = GameMode.ADVENTURE
        hashMap["Spectator"] = GameMode.SPECTATOR
        val p = sender as Player
        if (cmd.name.equals("activestatus", ignoreCase = true)) {
            p.sendMessage(ChatColor.GREEN.toString() + "BHW Plugin is Enabled.")
        }
        if (cmd.name.equals("credits", ignoreCase = true)) {
            p.sendMessage(
                "Creator : BaeHyeonWoo.\n====================\nv1.4\n====================\nShoutout to HappyAndJust for Fixing and edited some code to active this plugin well."
            )
            return false
        }
        if (cmd.name.equals("stop", ignoreCase = true)) {
            if (p.isOp) {
                Bukkit.shutdown()
            } else {
                p.sendMessage("This command is Disabled for some shitz.\nㅈ같은 현상을 방지하기 위해 stop명령어를 막았습니다.")
                return true
            }
        }
        if (cmd.name.equals("ci", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.clear()
                p.sendMessage(
                    """
    ${ChatColor.GREEN}Cleared your Inventory.
    인벤토리가 비워졌습니다.
    """.trimIndent()
                )
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("compass", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.addItem(*arrayOf(ItemStack(Material.COMPASS, 1)))
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("nightvision", ignoreCase = true)) {
            p.addPotionEffect(PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true))
        }
        if (cmd.name.equals("diasetpvp", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.helmet = ItemStack(Material.DIAMOND_HELMET)
                p.inventory.chestplate = ItemStack(Material.DIAMOND_CHESTPLATE)
                p.inventory.boots = ItemStack(Material.DIAMOND_BOOTS)
                p.inventory.leggings = ItemStack(Material.DIAMOND_LEGGINGS)
                p.inventory.addItem(*arrayOf(ItemStack(Material.DIAMOND_SWORD, 1)))
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("goldsetpvp", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.helmet = ItemStack(Material.GOLDEN_HELMET)
                p.inventory.chestplate = ItemStack(Material.GOLDEN_CHESTPLATE)
                p.inventory.boots = ItemStack(Material.GOLDEN_BOOTS)
                p.inventory.leggings = ItemStack(Material.GOLDEN_LEGGINGS)
                p.inventory.addItem(*arrayOf(ItemStack(Material.GOLDEN_SWORD, 1)))
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("ironsetpvp", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.helmet = ItemStack(Material.IRON_HELMET)
                p.inventory.chestplate = ItemStack(Material.IRON_CHESTPLATE)
                p.inventory.boots = ItemStack(Material.IRON_BOOTS)
                p.inventory.leggings = ItemStack(Material.IRON_LEGGINGS)
                p.inventory.addItem(*arrayOf(ItemStack(Material.IRON_SWORD, 1)))
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("leathersetpvp", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.helmet = ItemStack(Material.LEATHER_HELMET)
                p.inventory.chestplate = ItemStack(Material.LEATHER_CHESTPLATE)
                p.inventory.boots = ItemStack(Material.LEATHER_BOOTS)
                p.inventory.leggings = ItemStack(Material.LEATHER_LEGGINGS)
                p.inventory.addItem(*arrayOf(ItemStack(Material.WOODEN_SWORD, 1)))
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("chainsetpvp", ignoreCase = true)) {
            if (p.isOp) {
                p.inventory.helmet = ItemStack(Material.CHAINMAIL_HELMET)
                p.inventory.chestplate = ItemStack(Material.CHAINMAIL_CHESTPLATE)
                p.inventory.boots = ItemStack(Material.CHAINMAIL_BOOTS)
                p.inventory.leggings = ItemStack(Material.CHAINMAIL_LEGGINGS)
                p.inventory.addItem(*arrayOf(ItemStack(Material.STONE_SWORD, 1)))
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("god", ignoreCase = true)) {
            if (p.isOp) {
                p.getAttribute(Attribute.GENERIC_MAX_HEALTH)!!.baseValue = 2048.0
                p.addPotionEffect(PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.CONDUIT_POWER, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.REGENERATION, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.ABSORPTION, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.HEAL, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.FAST_DIGGING, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 15, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 255, true))
                p.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255, true))
                p.playSound(p.location, Sound.ENTITY_WITHER_SPAWN, 1000.0f, 0.0f)
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("invisible", ignoreCase = true)) {
            if (p.isOp) {
                p.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255))
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("ev", ignoreCase = true)) {
            if (p.isOp) {
                p.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255))
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("rmgod", ignoreCase = true)) {
            if (p.isOp) {
                p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE)
                p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE)
                p.removePotionEffect(PotionEffectType.CONDUIT_POWER)
                p.removePotionEffect(PotionEffectType.ABSORPTION)
                p.removePotionEffect(PotionEffectType.HEALTH_BOOST)
                p.removePotionEffect(PotionEffectType.HEAL)
                p.removePotionEffect(PotionEffectType.DOLPHINS_GRACE)
                p.removePotionEffect(PotionEffectType.FAST_DIGGING)
                p.removePotionEffect(PotionEffectType.JUMP)
                p.removePotionEffect(PotionEffectType.INVISIBILITY)
                p.removePotionEffect(PotionEffectType.REGENERATION)
                p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE)
                p.removePotionEffect(PotionEffectType.NIGHT_VISION)
                p.stopSound(Sound.ENTITY_WITHER_SPAWN)
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("rmev", ignoreCase = true)) {
            p.removePotionEffect(PotionEffectType.INVISIBILITY)
        }
        if (cmd.name.equals("rminvisi", ignoreCase = true)) {
            p.removePotionEffect(PotionEffectType.INVISIBILITY)
        }
        if (cmd.name.equals("feed", ignoreCase = true)) {
            if (p.isOp) {
                p.foodLevel = 20
                p.sendMessage(
                    """${ChatColor.GREEN}Feeded.
 배고픔이 채워졌습니다."""
                )
            } else {
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("heal", ignoreCase = true)) {
            if (p.isOp) {
                p.health = p.getAttribute(Attribute.GENERIC_MAX_HEALTH)!!.baseValue
                p.sendMessage(
                    """
    ${ChatColor.GREEN}Healed.
    체력이 채워졌습니다.
    """.trimIndent()
                )
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        var w: World
        var var7: Iterator<World>
        if (cmd.name.equals("spacemode", ignoreCase = true)) {
            if (p.isOp) {
                p.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 15))
                p.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 255))
                p.addPotionEffect(PotionEffect(PotionEffectType.LEVITATION, 1000000, 254))
                p.addPotionEffect(PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255))
                p.inventory.helmet = ItemStack(Material.GLASS)
                var7 = Bukkit.getServer().worlds.iterator()
                while (var7.hasNext()) {
                    w = var7.next()
                    w.time = 15000L
                }
                p.sendMessage(
                    """
    ${ChatColor.LIGHT_PURPLE}Houston, we have a problem.
    Spacemode is activated.
    """.trimIndent()
                )
            } else { // Sender is not op
                sender.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("deactspace", ignoreCase = true)) {
            if (p.hasPotionEffect(PotionEffectType.JUMP)) {
                p.removePotionEffect(PotionEffectType.JUMP)
                p.removePotionEffect(PotionEffectType.LEVITATION)
                p.removePotionEffect(PotionEffectType.NIGHT_VISION)
                p.inventory.helmet = ItemStack(Material.AIR)
                p.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 100, 255))
                var7 = Bukkit.getServer().worlds.iterator()
                while (var7.hasNext()) {
                    w = var7.next()
                    w.time = 1000L
                }
            }
            p.sendMessage(ChatColor.LIGHT_PURPLE.toString() + "Spacemode is deactivated.")
        }
        if (cmd.name.equals("giveop", ignoreCase = true)) {
            if (p.isOp) {
                p.sendMessage(
                    """${ChatColor.RED}You are already an operator.
 당신은 이미 관리자입니다."""
                )
            } else {
                p.isOp = true
                p.sendMessage(
                    """
    ${ChatColor.GREEN}You are now an operator.
    당신은 이제 관리자입니다.
    """.trimIndent()
                )
            }
        }
        if (cmd.name.equals("gm", ignoreCase = true) || cmd.name.equals("gamemode", ignoreCase = true)) {
            if (sender.isOp()) {
                if (args.isEmpty()) {
                    sender.sendMessage(
                        ChatColor.RED
                            .toString() + "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n"
                                + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D"
                    )
                    return true
                }
                var str = args[0]
                str = if (str == "0") "Survival" else str
                str = if (str == "1") "Creative" else str
                str = if (str == "2") "Adventure" else str
                str = if (str == "3") "Spectator" else str
                val gm = hashMap[str]
                if (args.size == 1) {
                    if (gm != null) {
                        p.sendMessage("Set your own gamemode to $str Mode.")
                    } else {
                        sender.sendMessage(
                            ChatColor.RED
                                .toString() + "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n"
                                    + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D"
                        )
                        return false
                    }
                    p.gameMode = gm
                } else if (args.size == 2) {
                    val target = Bukkit.getPlayer(args[1])
                    if (target != null) {
                        if (gm != null) {
                            p.sendMessage("Set " + target.name + "'s gamemode to " + str + " Mode.")
                            target.sendMessage(
                                "You gamemode has been updated to " + str + " Mode by " + p.name + "."
                            )
                        } else {
                            sender.sendMessage(
                                ChatColor.RED
                                    .toString() + "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n"
                                        + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D"
                            )
                            return false
                        }
                        target.gameMode = gm
                    } else {
                        sender.sendMessage("${ChatColor.RED}${args[1]} isn't founded in this server!")
                    }
                } else {
                    sender.sendMessage(
                        ChatColor.RED
                            .toString() + "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n"
                                + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D"
                    )
                }
            }
        } else { // sender is not op
            sender.sendMessage(
                """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
            )
            return true
        }
        if (cmd.name.equals("difficulty", ignoreCase = true)) {
            if (p.isOp) {
                if (args.isEmpty()) {
                    p.sendMessage(
                        ChatColor.RED
                            .toString() + "Missing Arguements! Command Usage :\n/difficulty 0\n/difficulty 1\n/difficulty 2\n/difficulty 3"
                    )
                } else if (args.size == 1) {
                    if (args[0].equals("0", ignoreCase = true) || args[0]
                            .equals("peaceful", ignoreCase = true)
                    ) {
                        Bukkit.getWorld("world")!!.difficulty = Difficulty.PEACEFUL
                        p.sendMessage("Difficulty set to Peaceful.\n난이도가 평화로움으로 설정되었습니다.")
                    } else if (args[0].equals("1", ignoreCase = true) || args[0]
                            .equals("easy", ignoreCase = true)
                    ) {
                        Bukkit.getWorld("world")!!.difficulty = Difficulty.EASY
                        p.sendMessage("Difficulty set to Easy.\n난이도가 쉬움으로 설정되었습니다.")
                    } else if (args[0].equals("2", ignoreCase = true) || args[0]
                            .equals("normal", ignoreCase = true)
                    ) {
                        Bukkit.getWorld("world")!!.difficulty = Difficulty.NORMAL
                        p.sendMessage("Difficulty set to Normal.\n난이도가 보통으로 설정되었습니다.")
                    } else if (args[0].equals("3", ignoreCase = true) || args[0]
                            .equals("hard", ignoreCase = true)
                    ) {
                        Bukkit.getWorld("world")!!.difficulty = Difficulty.HARD
                        p.sendMessage("Difficulty set to Hard.\n난이도가 어려움으로 설정되었습니다.")
                    }
                }
            } else {
                p.sendMessage(
                    """
    ${ChatColor.RED}No Administrative Previllages Founded.
    관리자 권한이 없습니다.
    """.trimIndent()
                )
            }
        }
        return false
    }
    override fun onTabComplete(sender: CommandSender, cmd: Command, label: String, args: Array<String>): List<String> {
        return emptyList()
    }
}