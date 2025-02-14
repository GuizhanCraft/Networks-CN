/**
 * localization / translation helper
 * 
 * based on Supreme simple idea [https://github.com/Slimefun-Addon-Community/Supreme/blob/main/src/main/java/com/github/relativobr/supreme/SupremeLocalization.java]
 */
package io.github.sefiraat.networks;

import java.text.MessageFormat;
import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import net.guizhanss.guizhanlib.localization.Localization;
import net.guizhanss.guizhanlib.minecraft.utils.ChatUtil;
import net.guizhanss.guizhanlib.utils.StringUtil;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;

import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;

import org.bukkit.entity.Player;

public class LocalizationHelper extends Localization
{
	/**
	 * constructor
	 */
	public LocalizationHelper(Networks plugin) {
		super(plugin);
	}

	/****
	 * get the string of key, formating
	 * 
	 * @param key
	 * @param args
	 * @return
	 */
	@ParametersAreNonnullByDefault
	public @Nonnull
	String getString(String key, Object... args) {
		return MessageFormat.format(getString(key), args);
	}

	/**
	 * return category name
	 * 
	 * @param categoryId
	 * @return
	 */
	public @Nonnull
	String getCategoryName(@Nonnull String categoryId) {
		Validate.notNull(categoryId, "Category Id cannot be null");

		return getString("categories." + StringUtil.dehumanize(categoryId).toLowerCase(Locale.ROOT));
	}

	/**
	 * get item name
	 * 
	 * @param itemId
	 * @return
	 */
	public @Nonnull
	String getItemName(@Nonnull String itemId) {
		Validate.notNull(itemId, "Item Id cannot be null");

		return getString("items." + StringUtil.dehumanize(itemId).toLowerCase(Locale.ROOT) + ".name");
	}

	/***
	 * get item lore
	 * 
	 * @param itemId
	 * @return
	 */
	public @Nonnull
	String[] getItemLore(@Nonnull String itemId) {
		Validate.notNull(itemId, "Item Id cannot be null");

		return getStringArray("items." + StringUtil.dehumanize(itemId).toLowerCase(Locale.ROOT) + ".lore");
	}

	/***
	 * get item extra/conditional lore
	 * 
	 * @param itemId
	 * @return
	 */
	public @Nonnull
	String[] getItemItemAditionalLore(@Nonnull String itemId) {
		Validate.notNull(itemId, "Item Id cannot be null");

		return getStringArray("items." + StringUtil.dehumanize(itemId).toLowerCase(Locale.ROOT) + ".aditional_lore");
	}

	/**
	 * get research name
	 * 
	 * @param researchId
	 * @return
	 */
	public @Nonnull
	String getResearchName(@Nonnull String researchId) {
		Validate.notNull(researchId, "Research Id cannot be null");

		return getString("researches." + StringUtil.dehumanize(researchId).toLowerCase(Locale.ROOT));
	}

	/**
	 * get messages byy key
	 * 
	 * @param p
	 * @param messageKey
	 * @param args
	 */
	public @Nonnull
	String getMessage(@Nonnull String messageId) {
		Validate.notNull(messageId, "Message Id cannot be null");

		return getString("messages." + StringUtil.dehumanize(messageId).toLowerCase(Locale.ROOT));
	}


	/**
	 * get research description
	 * 
	 * @param p
	 * @param messageKey
	 * @param args
	 */
	@ParametersAreNonnullByDefault
	public void sendMessage(Player p, String messageKey, Object... args) {
		Validate.notNull(p, "Player cannot be null");
		Validate.notNull(messageKey, "Message key cannot be null");

		ChatUtil.send(p, MessageFormat.format(getString("messages." + messageKey), args));
	}

	/***
	 * send actionbar message
	 * 
	 * @param p
	 * @param messageKey
	 * @param args
	 */
	@ParametersAreNonnullByDefault
	public void sendActionbarMessage(Player p, String messageKey, Object... args) {
		Validate.notNull(p, "Player cannot be null");
		Validate.notNull(messageKey, "Message key cannot be null");

		String message = MessageFormat.format(getString("messages." + messageKey), args);

		BaseComponent[] components = TextComponent.fromLegacyText(ChatUtil.color(message));
		p.spigot().sendMessage(ChatMessageType.ACTION_BAR, components);
	}
}
