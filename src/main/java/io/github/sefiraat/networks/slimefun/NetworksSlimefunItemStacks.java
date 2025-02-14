package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.Networks;
import io.github.sefiraat.networks.slimefun.network.NetworkQuantumStorage;
import io.github.sefiraat.networks.slimefun.tools.NetworkRemote;
import io.github.sefiraat.networks.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Creating SlimefunItemstacks here due to some items being created in Enums so this will
 * act as a one-stop-shop for the stacks themselves.
 */
@UtilityClass
public class NetworksSlimefunItemStacks {

    // Materials
    public static final SlimefunItemStack SYNTHETIC_EMERALD_SHARD;
    public static final SlimefunItemStack OPTIC_GLASS;
    public static final SlimefunItemStack OPTIC_CABLE;
    public static final SlimefunItemStack OPTIC_STAR;
    public static final SlimefunItemStack RADIOACTIVE_OPTIC_STAR;
    public static final SlimefunItemStack SHRINKING_BASE;
    public static final SlimefunItemStack SIMPLE_NANOBOTS;
    public static final SlimefunItemStack ADVANCED_NANOBOTS;
    public static final SlimefunItemStack AI_CORE;
    public static final SlimefunItemStack EMPOWERED_AI_CORE;
    public static final SlimefunItemStack PRISTINE_AI_CORE;
    public static final SlimefunItemStack INTERDIMENSIONAL_PRESENCE;

    // Network Items
    public static final SlimefunItemStack NETWORK_CONTROLLER;
    public static final SlimefunItemStack NETWORK_BRIDGE;
    public static final SlimefunItemStack NETWORK_MONITOR;
    public static final SlimefunItemStack NETWORK_IMPORT;
    public static final SlimefunItemStack NETWORK_EXPORT;
    public static final SlimefunItemStack NETWORK_GRABBER;
    public static final SlimefunItemStack NETWORK_PUSHER;
    public static final SlimefunItemStack NETWORK_CONTROL_X;
    public static final SlimefunItemStack NETWORK_CONTROL_V;
    public static final SlimefunItemStack NETWORK_VACUUM;
    public static final SlimefunItemStack NETWORK_VANILLA_GRABBER;
    public static final SlimefunItemStack NETWORK_VANILLA_PUSHER;
    public static final SlimefunItemStack NETWORK_WIRELESS_TRANSMITTER;
    public static final SlimefunItemStack NETWORK_WIRELESS_RECEIVER;
    public static final SlimefunItemStack NETWORK_PURGER;
    public static final SlimefunItemStack NETWORK_GRID;
    public static final SlimefunItemStack NETWORK_CRAFTING_GRID;
    public static final SlimefunItemStack NETWORK_CELL;
    public static final SlimefunItemStack NETWORK_GREEDY_BLOCK;
    public static final SlimefunItemStack NETWORK_QUANTUM_WORKBENCH;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_1;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_2;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_3;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_4;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_5;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_6;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_7;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_8;
    public static final SlimefunItemStack NETWORK_CAPACITOR_1;
    public static final SlimefunItemStack NETWORK_CAPACITOR_2;
    public static final SlimefunItemStack NETWORK_CAPACITOR_3;
    public static final SlimefunItemStack NETWORK_CAPACITOR_4;
    public static final SlimefunItemStack NETWORK_POWER_OUTLET_1;
    public static final SlimefunItemStack NETWORK_POWER_OUTLET_2;
    public static final SlimefunItemStack NETWORK_POWER_DISPLAY;
    public static final SlimefunItemStack NETWORK_RECIPE_ENCODER;
    public static final SlimefunItemStack NETWORK_AUTO_CRAFTER;
    public static final SlimefunItemStack NETWORK_AUTO_CRAFTER_WITHHOLDING;

    // Tools
    public static final SlimefunItemStack CRAFTING_BLUEPRINT;
    public static final SlimefunItemStack NETWORK_PROBE;
    public static final SlimefunItemStack NETWORK_REMOTE;
    public static final SlimefunItemStack NETWORK_REMOTE_EMPOWERED;
    public static final SlimefunItemStack NETWORK_REMOTE_PRISTINE;
    public static final SlimefunItemStack NETWORK_REMOTE_ULTIMATE;
    public static final SlimefunItemStack NETWORK_CRAYON;
    public static final SlimefunItemStack NETWORK_CONFIGURATOR;
    public static final SlimefunItemStack NETWORK_WIRELESS_CONFIGURATOR;
    public static final SlimefunItemStack NETWORK_RAKE_1;
    public static final SlimefunItemStack NETWORK_RAKE_2;
    public static final SlimefunItemStack NETWORK_RAKE_3;
    public static final SlimefunItemStack NETWORK_DEBUG_STICK;

    static {

        SYNTHETIC_EMERALD_SHARD = Theme.themedSlimefunItemStack(
            "NTW_SYNTHETIC_EMERALD_SHARD",
            new ItemStack(Material.LIME_DYE),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_synthetic_emerald_shard"),
            Networks.getLocalization().getItemLore("ntw_synthetic_emerald_shard")
        );

        OPTIC_GLASS = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_GLASS",
            new ItemStack(Material.GLASS),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_optic_glass"),
            Networks.getLocalization().getItemLore("ntw_optic_glass")
        );

        OPTIC_CABLE = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_CABLE",
            new ItemStack(Material.STRING),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_optic_cable"),
            Networks.getLocalization().getItemLore("ntw_optic_cable")
        );

        OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_STAR",
            new ItemStack(Material.NETHER_STAR),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_optic_star"),
            Networks.getLocalization().getItemLore("ntw_optic_star")
        );

        RADIOACTIVE_OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_RADIOACTIVE_OPTIC_STAR",
            getPreEnchantedItemStack(Material.NETHER_STAR, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_radioactive_optic_star"),
            Networks.getLocalization().getItemLore("ntw_radioactive_optic_star")
        );

        SHRINKING_BASE = Theme.themedSlimefunItemStack(
            "NTW_SHRINKING_BASE",
            getPreEnchantedItemStack(Material.PISTON, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_shrinking_base"),
            Networks.getLocalization().getItemLore("ntw_shrinking_base")
        );

        SIMPLE_NANOBOTS = Theme.themedSlimefunItemStack(
            "NTW_SIMPLE_NANOBOTS",
            new ItemStack(Material.MELON_SEEDS),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_simple_nanobots"),
            Networks.getLocalization().getItemLore("ntw_simple_nanobots")
        );

        ADVANCED_NANOBOTS = Theme.themedSlimefunItemStack(
            "NTW_ADVANCED_NANOBOTS",
            getPreEnchantedItemStack(Material.MELON_SEEDS, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_advanced_nanobots"),
            Networks.getLocalization().getItemLore("ntw_advanced_nanobots")
        );

        AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_AI_CORE",
            new ItemStack(Material.BRAIN_CORAL_BLOCK),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_ai_core"),
            Networks.getLocalization().getItemLore("ntw_ai_core")
        );

        EMPOWERED_AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_EMPOWERED_AI_CORE",
            new ItemStack(Material.TUBE_CORAL_BLOCK),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_empowered_ai_core"),
            Networks.getLocalization().getItemLore("ntw_empowered_ai_core")
        );

        PRISTINE_AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_PRISTINE_AI_CORE",
            getPreEnchantedItemStack(Material.TUBE_CORAL_BLOCK, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_pristine_ai_core"),
            Networks.getLocalization().getItemLore("ntw_pristine_ai_core")
        );

        INTERDIMENSIONAL_PRESENCE = Theme.themedSlimefunItemStack(
            "NTW_INTERDIMENSIONAL_PRESENCE",
            getPreEnchantedItemStack(Material.ARMOR_STAND, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.CRAFTING,
            Networks.getLocalization().getItemName("ntw_interdimensional_presence"),
            Networks.getLocalization().getItemLore("ntw_interdimensional_presence")
        );

        NETWORK_CONTROLLER = Theme.themedSlimefunItemStack(
            "NTW_CONTROLLER",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_controller"),
            Networks.getLocalization().getItemLore("ntw_controller")
        );

        NETWORK_BRIDGE = Theme.themedSlimefunItemStack(
            "NTW_BRIDGE",
            new ItemStack(Material.WHITE_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_bridge"),
            Networks.getLocalization().getItemLore("ntw_bridge")
        );

        NETWORK_MONITOR = Theme.themedSlimefunItemStack(
            "NTW_MONITOR",
            new ItemStack(Material.GREEN_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_monitor"),
            Networks.getLocalization().getItemLore("ntw_monitor")
        );

        NETWORK_IMPORT = Theme.themedSlimefunItemStack(
            "NTW_IMPORT",
            new ItemStack(Material.RED_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_import"),
            Networks.getLocalization().getItemLore("ntw_import")
        );

        NETWORK_EXPORT = Theme.themedSlimefunItemStack(
            "NTW_EXPORT",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_export"),
            Networks.getLocalization().getItemLore("ntw_export")
        );

        NETWORK_GRABBER = Theme.themedSlimefunItemStack(
            "NTW_GRABBER",
            new ItemStack(Material.MAGENTA_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_grabber"),
            Networks.getLocalization().getItemLore("ntw_grabber")
        );

        NETWORK_PUSHER = Theme.themedSlimefunItemStack(
            "NTW_PUSHER",
            new ItemStack(Material.BROWN_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_pusher"),
            Networks.getLocalization().getItemLore("ntw_pusher")
        );

        NETWORK_CONTROL_X = Theme.themedSlimefunItemStack(
            "NTW_CONTROL_X",
            new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_control_x"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_control_x")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_control_x")[0], Theme.CLICK_INFO, Theme.PASSIVE, 100))
            ).toArray(String[]::new)
            
        );

        NETWORK_CONTROL_V = Theme.themedSlimefunItemStack(
            "NTW_CONTROL_V",
            new ItemStack(Material.PURPLE_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_control_v"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_control_v")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_control_v")[0], Theme.CLICK_INFO, Theme.PASSIVE, 100))
            ).toArray(String[]::new)
        );

        NETWORK_VACUUM = Theme.themedSlimefunItemStack(
            "NTW_VACUUM",
            new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_vacuum"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_vacuum")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_vacuum")[0], Theme.CLICK_INFO, Theme.PASSIVE, 100))
            ).toArray(String[]::new)
        );

        NETWORK_VANILLA_GRABBER = Theme.themedSlimefunItemStack(
            "NTW_VANILLA_GRABBER",
            new ItemStack(Material.ORANGE_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_vanilla_grabber"),
            Networks.getLocalization().getItemLore("ntw_vanilla_grabber")
        );

        NETWORK_VANILLA_PUSHER = Theme.themedSlimefunItemStack(
            "NTW_VANILLA_PUSHER",
            new ItemStack(Material.LIME_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_vanilla_pusher"),
            Networks.getLocalization().getItemLore("ntw_vanilla_pusher")
        );

        NETWORK_WIRELESS_TRANSMITTER = Theme.themedSlimefunItemStack(
            "NTW_NETWORK_WIRELESS_TRANSMITTER",
            new ItemStack(Material.CYAN_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_network_wireless_transmitter"),
            Networks.getLocalization().getItemLore("ntw_network_wireless_transmitter")
        );

        NETWORK_WIRELESS_RECEIVER = Theme.themedSlimefunItemStack(
            "NTW_NETWORK_WIRELESS_RECEIVER",
            new ItemStack(Material.PURPLE_STAINED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_network_wireless_receiver"),
            Networks.getLocalization().getItemLore("ntw_network_wireless_receiver")
        );

        NETWORK_PURGER = Theme.themedSlimefunItemStack(
            "NTW_TRASH",
            new ItemStack(Material.OBSERVER),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_trash"),
            Networks.getLocalization().getItemLore("ntw_trash")
        );

        NETWORK_GRID = Theme.themedSlimefunItemStack(
            "NTW_GRID",
            new ItemStack(Material.NOTE_BLOCK),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_grid"),
            Networks.getLocalization().getItemLore("ntw_grid")
        );

        NETWORK_CRAFTING_GRID = Theme.themedSlimefunItemStack(
            "NTW_CRAFTING_GRID",
            new ItemStack(Material.REDSTONE_LAMP),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_crafting_grid"),
            Networks.getLocalization().getItemLore("ntw_crafting_grid")
        );

        NETWORK_CELL = Theme.themedSlimefunItemStack(
            "NTW_CELL",
            new ItemStack(Material.HONEYCOMB_BLOCK),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_cell"),
            Networks.getLocalization().getItemLore("ntw_cell")
        );

        NETWORK_GREEDY_BLOCK = Theme.themedSlimefunItemStack(
            "NTW_GREEDY_BLOCK",
            new ItemStack(Material.SHROOMLIGHT),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_greedy_block"),
            Networks.getLocalization().getItemLore("ntw_greedy_block")
        );

        NETWORK_QUANTUM_WORKBENCH = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_WORKBENCH",
            new ItemStack(Material.DRIED_KELP_BLOCK),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_workbench"),
            Networks.getLocalization().getItemLore("ntw_quantum_workbench")
        );

        NETWORK_QUANTUM_STORAGE_1 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_1",
            new ItemStack(Material.WHITE_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_1"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_1")
        );

        NETWORK_QUANTUM_STORAGE_2 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_2",
            new ItemStack(Material.LIGHT_GRAY_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_2"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_2")
        );

        NETWORK_QUANTUM_STORAGE_3 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_3",
            new ItemStack(Material.GRAY_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_3"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_3")
        );

        NETWORK_QUANTUM_STORAGE_4 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_4",
            new ItemStack(Material.BROWN_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_4"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_4")
        );

        NETWORK_QUANTUM_STORAGE_5 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_5",
            new ItemStack(Material.BLACK_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_5"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_5")
        );

        NETWORK_QUANTUM_STORAGE_6 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_6",
            new ItemStack(Material.PURPLE_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_6"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_6")
        );

        NETWORK_QUANTUM_STORAGE_7 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_7",
            new ItemStack(Material.MAGENTA_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_7"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_7")
        );

        NETWORK_QUANTUM_STORAGE_8 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_8",
            new ItemStack(Material.RED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_quantum_storage_8"),
            Networks.getLocalization().getItemLore("ntw_quantum_storage_8")
        );

        NETWORK_CAPACITOR_1 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_1",
            new ItemStack(Material.BROWN_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_capacitor_1"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_capacitor_1")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_capacitor_1")[0], Theme.CLICK_INFO, Theme.PASSIVE, 1000))
            ).toArray(String[]::new)
        );

        NETWORK_CAPACITOR_2 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_2",
            new ItemStack(Material.GREEN_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_capacitor_2"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_capacitor_2")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_capacitor_2")[0], Theme.CLICK_INFO, Theme.PASSIVE, 10000))
            ).toArray(String[]::new)
        );

        NETWORK_CAPACITOR_3 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_3",
            new ItemStack(Material.BLACK_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_capacitor_3"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_capacitor_3")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_capacitor_3")[0], Theme.CLICK_INFO, Theme.PASSIVE, 100000))
            ).toArray(String[]::new)
        );

        NETWORK_CAPACITOR_4 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_4",
            new ItemStack(Material.GRAY_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_capacitor_4"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_capacitor_4")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_capacitor_4")[0], Theme.CLICK_INFO, Theme.PASSIVE, 1000000))
            ).toArray(String[]::new)
        );

        NETWORK_POWER_OUTLET_1 = Theme.themedSlimefunItemStack(
            "NTW_POWER_OUTLET_1",
            new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_power_outlet_1"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_power_outlet_1")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_power_outlet_1")[0], Theme.CLICK_INFO, Theme.PASSIVE, 500))
            ).toArray(String[]::new)
        );

        NETWORK_POWER_OUTLET_2 = Theme.themedSlimefunItemStack(
            "NTW_POWER_OUTLET_2",
            new ItemStack(Material.RED_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_power_outlet_2"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_power_outlet_2")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_power_outlet_2")[0], Theme.CLICK_INFO, Theme.PASSIVE, 2000))
            ).toArray(String[]::new)
        );

        NETWORK_POWER_DISPLAY = Theme.themedSlimefunItemStack(
            "NTW_POWER_DISPLAY",
            new ItemStack(Material.TINTED_GLASS),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_power_display"),
            Networks.getLocalization().getItemLore("ntw_power_display")
        );

        NETWORK_RECIPE_ENCODER = Theme.themedSlimefunItemStack(
            "NTW_RECIPE_ENCODER",
            new ItemStack(Material.TARGET),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_recipe_encoder"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_recipe_encoder")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_recipe_encoder")[0], Theme.CLICK_INFO, Theme.PASSIVE, 20000))
            ).toArray(String[]::new)
        );

        NETWORK_AUTO_CRAFTER = Theme.themedSlimefunItemStack(
            "NTW_AUTO_CRAFTER",
            new ItemStack(Material.BLACK_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_auto_crafter"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_auto_crafter")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_auto_crafter")[0], Theme.CLICK_INFO, Theme.PASSIVE, 64))
            ).toArray(String[]::new)
        );

        NETWORK_AUTO_CRAFTER_WITHHOLDING = Theme.themedSlimefunItemStack(
            "NTW_AUTO_CRAFTER_WITHHOLDING",
            new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            Networks.getLocalization().getItemName("ntw_auto_crafter_withholding"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_auto_crafter_withholding")),
                Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_auto_crafter_withholding")[0], Theme.CLICK_INFO, Theme.PASSIVE, 128))
            ).toArray(String[]::new)
        );

        CRAFTING_BLUEPRINT = Theme.themedSlimefunItemStack(
            "NTW_CRAFTING_BLUEPRINT",
            new ItemStack(Material.BLUE_DYE),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_crafting_blueprint"),
            Networks.getLocalization().getItemLore("ntw_crafting_blueprint")
        );

        NETWORK_PROBE = Theme.themedSlimefunItemStack(
            "NTW_PROBE",
            new ItemStack(Material.CLOCK),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_probe"),
            Networks.getLocalization().getItemLore("ntw_probe")
        );

        NETWORK_REMOTE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE",
            new ItemStack(Material.PAINTING),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_remote"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_remote")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote")[1], Theme.CLICK_INFO, Theme.PASSIVE, NetworkRemote.getRanges()[1]))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_REMOTE_EMPOWERED = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_EMPOWERED",
            new ItemStack(Material.ITEM_FRAME),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_remote_empowered"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_remote_empowered")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_empowered")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_empowered")[1], Theme.CLICK_INFO, Theme.PASSIVE, NetworkRemote.getRanges()[1]))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_REMOTE_PRISTINE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_PRISTINE",
            new ItemStack(Material.GLOW_ITEM_FRAME),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_remote_pristine"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_remote_pristine")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_pristine")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_pristine")[1], Theme.CLICK_INFO, Theme.PASSIVE))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_REMOTE_ULTIMATE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_ULTIMATE",
            getPreEnchantedItemStack(Material.GLOW_ITEM_FRAME, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_remote_ultimate"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_remote_ultimate")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_ultimate")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_remote_ultimate")[1], Theme.CLICK_INFO, Theme.PASSIVE))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_CRAYON = Theme.themedSlimefunItemStack(
            "NTW_CRAYON",
            new ItemStack(Material.RED_CANDLE),
            Theme.TOOL,Networks.getLocalization().getItemName("ntw_crayon"),
            Networks.getLocalization().getItemLore("ntw_crayon")
        );

        NETWORK_CONFIGURATOR = Theme.themedSlimefunItemStack(
            "NTW_CONFIGURATOR",
            new ItemStack(Material.BLAZE_ROD),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_configurator"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_configurator")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_configurator")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_configurator")[1], Theme.CLICK_INFO, Theme.PASSIVE))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_WIRELESS_CONFIGURATOR = Theme.themedSlimefunItemStack(
            "NTW_WIRELESS_CONFIGURATOR",
            new ItemStack(Material.BLAZE_ROD),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_wireless_configurator"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_wireless_configurator")),
                Stream.concat(
                    Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_wireless_configurator")[0], Theme.CLICK_INFO, Theme.PASSIVE)),
                    Stream.concat(
                        Stream.of(""),
                        Stream.of(MessageFormat.format(Networks.getLocalization().getItemItemAditionalLore("ntw_wireless_configurator")[1], Theme.CLICK_INFO, Theme.PASSIVE))
                    )
                )
            ).toArray(String[]::new)
        );

        NETWORK_RAKE_1 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_1",
            new ItemStack(Material.TWISTING_VINES),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_rake_1"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_rake_1")),
                Stream.of(LoreBuilder.usesLeft(250))
            ).toArray(String[]::new)

        );

        NETWORK_RAKE_2 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_2",
            new ItemStack(Material.WEEPING_VINES),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_rake_2"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_rake_2")),
                Stream.of(LoreBuilder.usesLeft(1000))
            ).toArray(String[]::new)
        );

        NETWORK_RAKE_3 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_3",
            getPreEnchantedItemStack(Material.WEEPING_VINES, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_rake_3"),
            Stream.concat(
                Arrays.stream(Networks.getLocalization().getItemLore("ntw_rake_3")),
                Stream.of(LoreBuilder.usesLeft(9999))
            ).toArray(String[]::new)
        );

        NETWORK_DEBUG_STICK = Theme.themedSlimefunItemStack(
            "NTW_DEBUG_STICK",
            getPreEnchantedItemStack(Material.STICK, true, new Pair<>(VersionedEnchantment.LUCK_OF_THE_SEA, 1)),
            Theme.TOOL,
            Networks.getLocalization().getItemName("ntw_debug_stick"),
            Networks.getLocalization().getItemLore("ntw_debug_stick")
        );
    }

    @Nonnull
    @SafeVarargs
    public static ItemStack getPreEnchantedItemStack(Material material, boolean hide, @Nonnull Pair<Enchantment, Integer>... enchantments) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        for (Pair<Enchantment, Integer> pair : enchantments) {
            itemMeta.addEnchant(pair.getFirstValue(), pair.getSecondValue(), true);
        }
        if (hide) {
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
