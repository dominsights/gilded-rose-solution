package com.gildedrose;

public class BackstagePasses extends QualityUpdatable {

	public BackstagePasses(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		item.quality = item.quality + 1;
		if (item.sellIn < 11) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
		if (item.sellIn < 6) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
		item.sellIn = item.sellIn - 1;
		if (item.sellIn < 0) {
			item.quality = item.quality - item.quality;
		}
		
	}

}
