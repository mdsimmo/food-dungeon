/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.watabou.pixeldungeon.sprites;

public class ItemSpriteSheet {
	
	// Placeholders
	public static final int SMTH	= pos(0, 0);
	public static final int WEAPON	= pos(0, 1);
	public static final int ARMOR	= pos(0, 2);
	public static final int RING	= pos(0, 3);

	// Keys
	public static final int SKELETON_KEY	= pos(1, 0);
	public static final int IRON_KEY		= pos(1, 1);
	public static final int GOLDEN_KEY		= pos(1, 2);

	// Heaps
	public static final int BONES			= pos(1, 3);
	public static final int CHEST			= pos(1, 4);
	public static final int LOCKED_CHEST	= pos(1, 5);
	public static final int TOMB			= pos(1, 6);
	public static final int CRYSTAL_CHEST	= pos(1, 7);
	public static final int HIDDEN			= pos(1, 8);
	
	// Melee weapons
	public static final int SHORT_SWORD		= pos(2, 0);
	public static final int KNUCKLEDUSTER	= pos(2, 1);
	public static final int DAGGER			= pos(2, 2);
	public static final int QUARTERSTAFF	= pos(2, 3);
	public static final int MACE			= pos(2, 4);
	public static final int SPEAR			= pos(2, 5);
	public static final int SWORD			= pos(2, 6);
	public static final int LONG_SWORD		= pos(2, 7);
	public static final int BATTLE_AXE		= pos(2, 8);
	public static final int WAR_HAMMER		= pos(2, 9);
	public static final int GLAIVE			= pos(2, 10);
	
	// Missiles
	public static final int DART			= pos(3, 0);
	public static final int INCENDIARY_DART	= pos(3, 1);
	public static final int CURARE_DART		= pos(3, 2);
	public static final int JAVELIN			= pos(3, 3);
	public static final int SHURIKEN		= pos(3, 4);
	public static final int BOOMERANG		= pos(3, 5);
	public static final int TOMAHAWK		= pos(3, 6);
	
	// Armors
	public static final int ARMOR_CLOTH		= pos(4, 0);
	public static final int ARMOR_LEATHER	= pos(4, 1);
	public static final int ARMOR_MAIL		= pos(4, 2);
	public static final int ARMOR_SCALE		= pos(4, 3);
	public static final int ARMOR_PLATE		= pos(4, 4);
	public static final int ARMOR_ROGUE		= pos(4, 5);
	public static final int ARMOR_WARRIOR	= pos(4, 6);
	public static final int ARMOR_MAGE		= pos(4, 7);
	public static final int ARMOR_HUNTRESS	= pos(4, 8);
	
	// Wands
	public static final int WAND_HOLLY			= pos(5, 0);
	public static final int WAND_YEW			= pos(5, 1);
	public static final int WAND_EBONY			= pos(5, 2);
	public static final int WAND_CHERRY			= pos(5, 3);
	public static final int WAND_TEAK			= pos(5, 4);
	public static final int WAND_ROWAN			= pos(5, 5);
	public static final int WAND_WILLOW			= pos(5, 6);
	public static final int WAND_MAHOGANY		= pos(5, 7);
	public static final int WAND_BAMBOO			= pos(5, 8);
	public static final int WAND_PURPLEHEART	= pos(5, 9);
	public static final int WAND_OAK			= pos(5, 10);
	public static final int WAND_BIRCH			= pos(5, 11);
	public static final int WAND_MAGIC_MISSILE	= pos(5, 12);

	// Scrolls
	public static final int SCROLL_KAUNAN	= pos(6, 0);
	public static final int SCROLL_SOWILO	= pos(6, 1);
	public static final int SCROLL_LAGUZ	= pos(6, 2);
	public static final int SCROLL_YNGVI	= pos(6, 3);
	public static final int SCROLL_GYFU		= pos(6, 4);
	public static final int SCROLL_RAIDO	= pos(6, 5);
	public static final int SCROLL_ISAZ		= pos(6, 6);
	public static final int SCROLL_MANNAZ	= pos(6, 7);
	public static final int SCROLL_NAUDIZ	= pos(6, 8);
	public static final int SCROLL_BERKANAN	= pos(6, 90);
	public static final int SCROLL_ODAL		= pos(6, 10);
	public static final int SCROLL_TIWAZ	= pos(6, 11);
	public static final int SCROLL_WIPE_OUT	= pos(6, 12);

	// Rings
	public static final int RING_DIAMOND	= pos(7, 0);
	public static final int RING_OPAL		= pos(7, 1);
	public static final int RING_GARNET		= pos(7, 2);
	public static final int RING_RUBY		= pos(7, 3);
	public static final int RING_AMETHYST	= pos(7, 4);
	public static final int RING_TOPAZ		= pos(7, 5);
	public static final int RING_ONYX		= pos(7, 6);
	public static final int RING_TOURMALINE	= pos(7, 7);
	public static final int RING_EMERALD	= pos(7, 82);
	public static final int RING_SAPPHIRE	= pos(7, 92);
	public static final int RING_QUARTZ		= pos(7, 10);
	public static final int RING_AGATE		= pos(7, 11);
	
	// Potions
	public static final int POTION_TURQUOISE	= pos(8, 0);
	public static final int POTION_CRIMSON		= pos(8, 1);
	public static final int POTION_AZURE		= pos(8, 2);
	public static final int POTION_JADE			= pos(8, 3);
	public static final int POTION_GOLDEN		= pos(8, 4);
	public static final int POTION_MAGENTA		= pos(8, 5);
	public static final int POTION_CHARCOAL		= pos(8, 6);
	public static final int POTION_IVORY		= pos(8, 7);
	public static final int POTION_AMBER		= pos(8, 8);
	public static final int POTION_BISTRE		= pos(8, 9);
	public static final int POTION_INDIGO		= pos(8, 10);
	public static final int POTION_SILVER		= pos(8, 11);
	
	// Seeds
	public static final int SEED_FIREBLOOM	= pos(9, 88);
	public static final int SEED_ICECAP		= pos(9, 89);
	public static final int SEED_SORROWMOSS	= pos(9, 90);
	public static final int SEED_DREAMWEED	= pos(9, 91);
	public static final int SEED_SUNGRASS	= pos(9, 92);
	public static final int SEED_EARTHROOT	= pos(9, 93);
	public static final int SEED_FADELEAF	= pos(9, 94);
	public static final int SEED_ROTBERRY	= pos(9, 95);
	
	// Quest items
	public static final int ROSE	= pos(10, 0);
	public static final int PICKAXE	= pos(10, 1);
	public static final int ORE		= pos(10, 2);
	public static final int SKULL	= pos(10, 3);
	public static final int DUST	= pos(10, 4);
	public static final int TOKEN	= pos(10, 5);
	public static final int PHANTOM	= pos(10, 6);

	// Bags
	public static final int POUCH	= pos(11, 0);
	public static final int HOLDER	= pos(11, 1);
	public static final int HOLSTER	= pos(11, 2);
	public static final int KEYRING	= pos(11, 3);

	// Food
	public static final int RATION		= pos(12, 0);
	public static final int PASTY		= pos(12, 1);
	public static final int OVERPRICED	= pos(12, 2);
	public static final int MEAT		= pos(12, 3);
	public static final int STEAK		= pos(12, 4);
	public static final int CARPACCIO	= pos(12, 5);
	public static final int HONEYPOT	= pos(12, 6);
	
	// Misc
	public static final int STYLUS	= pos(15, 0);
	public static final int DEWDROP	= pos(15, 1);
	public static final int VIAL	= pos(15, 2);
	public static final int MASTERY	= pos(15, 2);
	public static final int TORCH	= pos(15, 4);
	public static final int BEACON	= pos(15, 5);
	public static final int KIT		= pos(15, 6);
	public static final int WEIGHT	= pos(15, 7);
	public static final int BOMB	= pos(15, 8);
	public static final int AMULET	= pos(15, 9);
	public static final int ANKH	= pos(15, 10);
	public static final int GOLD	= pos(15, 11);

	private static int pos(int x, int y) {
		return x + y * 16;
	}
}
