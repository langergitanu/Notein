package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PresetTexture {
    public static final int BLUE_TISSUE_PAPER = 1;
    public static final int BOUQUET = 2;
    public static final int BROWN_MARBLE = 3;
    public static final int CANVAS = 4;
    public static final int CORK = 5;
    public static final int DENIM = 6;
    public static final int FISH_FOSSIL = 7;
    public static final int GRANITE = 8;
    public static final int GREEN_MARBLE = 9;
    public static final int MEDIUM_WOOD = 10;
    public static final int NEWSPRINT = 11;
    public static final int NONE = -1;
    public static final int OAK = 12;
    public static final int PAPER_BAG = 13;
    public static final int PAPYRUS = 14;
    public static final int PARCHMENT = 15;
    public static final int PINK_TISSUE_PAPER = 16;
    public static final int PURPLE_MESH = 17;
    public static final int RECYCLED_PAPER = 18;
    public static final int SAND = 19;
    public static final int STATIONERY = 20;
    public static final int WALNUT = 21;
    public static final int WATER_DROPLETS = 22;
    public static final int WHITE_MARBLE = 23;
    public static final int WOVEN_MAT = 24;
    public static final int length = 25;

    private PresetTexture() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return -1;
        }
        if ("BLUE_TISSUE_PAPER".equals(str)) {
            return 1;
        }
        if ("BOUQUET".equals(str)) {
            return 2;
        }
        if ("BROWN_MARBLE".equals(str)) {
            return 3;
        }
        if ("CANVAS".equals(str)) {
            return 4;
        }
        if ("CORK".equals(str)) {
            return 5;
        }
        if ("DENIM".equals(str)) {
            return 6;
        }
        if ("FISH_FOSSIL".equals(str)) {
            return 7;
        }
        if ("GRANITE".equals(str)) {
            return 8;
        }
        if ("GREEN_MARBLE".equals(str)) {
            return 9;
        }
        if ("MEDIUM_WOOD".equals(str)) {
            return 10;
        }
        if ("NEWSPRINT".equals(str)) {
            return 11;
        }
        if ("OAK".equals(str)) {
            return 12;
        }
        if ("PAPER_BAG".equals(str)) {
            return 13;
        }
        if ("PAPYRUS".equals(str)) {
            return 14;
        }
        if ("PARCHMENT".equals(str)) {
            return 15;
        }
        if ("PINK_TISSUE_PAPER".equals(str)) {
            return 16;
        }
        if ("PURPLE_MESH".equals(str)) {
            return 17;
        }
        if ("RECYCLED_PAPER".equals(str)) {
            return 18;
        }
        if ("SAND".equals(str)) {
            return 19;
        }
        if ("STATIONERY".equals(str)) {
            return 20;
        }
        if ("WALNUT".equals(str)) {
            return 21;
        }
        if ("WATER_DROPLETS".equals(str)) {
            return 22;
        }
        if ("WHITE_MARBLE".equals(str)) {
            return 23;
        }
        if ("WOVEN_MAT".equals(str)) {
            return 24;
        }
        throw new IllegalArgumentException("Unknown PresetTexture name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "NONE";
            case 0:
            default:
                return "Unknown PresetTexture value.";
            case 1:
                return "BLUE_TISSUE_PAPER";
            case 2:
                return "BOUQUET";
            case 3:
                return "BROWN_MARBLE";
            case 4:
                return "CANVAS";
            case 5:
                return "CORK";
            case 6:
                return "DENIM";
            case 7:
                return "FISH_FOSSIL";
            case 8:
                return "GRANITE";
            case 9:
                return "GREEN_MARBLE";
            case 10:
                return "MEDIUM_WOOD";
            case 11:
                return "NEWSPRINT";
            case 12:
                return "OAK";
            case 13:
                return "PAPER_BAG";
            case 14:
                return "PAPYRUS";
            case 15:
                return "PARCHMENT";
            case 16:
                return "PINK_TISSUE_PAPER";
            case 17:
                return "PURPLE_MESH";
            case 18:
                return "RECYCLED_PAPER";
            case 19:
                return "SAND";
            case 20:
                return "STATIONERY";
            case 21:
                return "WALNUT";
            case 22:
                return "WATER_DROPLETS";
            case 23:
                return "WHITE_MARBLE";
            case 24:
                return "WOVEN_MAT";
        }
    }

    public static int[] getValues() {
        return new int[]{-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "None";
            case 0:
            default:
                return "Unknown PresetTexture value.";
            case 1:
                return "BlueTissuePaper";
            case 2:
                return "Bouquet";
            case 3:
                return "BrownMarble";
            case 4:
                return "Canvas";
            case 5:
                return "Cork";
            case 6:
                return "Denim";
            case 7:
                return "FishFossil";
            case 8:
                return "Granite";
            case 9:
                return "GreenMarble";
            case 10:
                return "MediumWood";
            case 11:
                return "Newsprint";
            case 12:
                return "Oak";
            case 13:
                return "PaperBag";
            case 14:
                return "Papyrus";
            case 15:
                return "Parchment";
            case 16:
                return "PinkTissuePaper";
            case 17:
                return "PurpleMesh";
            case 18:
                return "RecycledPaper";
            case 19:
                return "Sand";
            case 20:
                return "Stationery";
            case 21:
                return "Walnut";
            case 22:
                return "WaterDroplets";
            case 23:
                return "WhiteMarble";
            case 24:
                return "WovenMat";
        }
    }
}
