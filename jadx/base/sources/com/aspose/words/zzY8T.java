package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8T {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzXQo = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4O = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4P = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4M = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4N = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4L = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ6C = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzX9C = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYH<String> zzXQr = new com.aspose.words.internal.zzZYH<>();
    private static com.aspose.words.internal.zzZYJ zzX9B = new com.aspose.words.internal.zzZYJ();

    static {
        zzXQo.zzH("default", 0);
        zzXQo.zzH("fixed", 1);
        zzXQo.zzH("variable", 2);
        zzZ4O.zzH("margin", 0);
        zzZ4O.zzH("page", 1);
        zzZ4O.zzH("outer-margin-area", 5);
        zzZ4O.zzH("inner-margin-area", 4);
        zzZ4O.zzH("top-margin-area", 2);
        zzZ4O.zzH("bottom-margin-area", 3);
        zzZ4P.zzH("margin", 0);
        zzZ4P.zzH("page", 1);
        zzZ4P.zzH("outer-margin-area", 5);
        zzZ4P.zzH("inner-margin-area", 4);
        zzZ4P.zzH("left-margin-area", 2);
        zzZ4P.zzH("right-margin-area", 3);
        zzZ4M.zzH("margin", 0);
        zzZ4M.zzH("page", 1);
        zzZ4M.zzH("text", 2);
        zzZ4M.zzH("line", 3);
        zzZ4M.zzH("outer-margin-area", 7);
        zzZ4M.zzH("inner-margin-area", 6);
        zzZ4M.zzH("top-margin-area", 4);
        zzZ4M.zzH("bottom-margin-area", 5);
        zzZ4N.zzH("margin", 0);
        zzZ4N.zzH("page", 1);
        zzZ4N.zzH("text", 2);
        zzZ4N.zzH("char", 3);
        zzZ4N.zzH("outer-margin-area", 7);
        zzZ4N.zzH("inner-margin-area", 6);
        zzZ4N.zzH("left-margin-area", 4);
        zzZ4N.zzH("right-margin-area", 5);
        zzZ4L.zzH("absolute", 0);
        zzZ4L.zzH("left", 1);
        zzZ4L.zzH("center", 2);
        zzZ4L.zzH("right", 3);
        zzZ4L.zzH("inside", 4);
        zzZ4L.zzH("outside", 5);
        zzZ6C.zzH("absolute", 0);
        zzZ6C.zzH("top", 1);
        zzZ6C.zzH("center", 2);
        zzZ6C.zzH("bottom", 3);
        zzZ6C.zzH("inside", 4);
        zzZ6C.zzH("outside", 5);
        zzX9C.zzH("Book Title", StyleIdentifier.BOOK_TITLE);
        zzX9C.zzH("annotation reference", 39);
        zzX9C.zzH("Default Paragraph Font", 65);
        zzX9C.zzH("Emphasis", 88);
        zzX9C.zzH("endnote reference", 42);
        zzX9C.zzH("FollowedHyperlink", 86);
        zzX9C.zzH("footnote reference", 38);
        zzX9C.zzH("HTML Acronym", 95);
        zzX9C.zzH("HTML Cite", 97);
        zzX9C.zzH("HTML Code", 98);
        zzX9C.zzH("HTML Definition", 99);
        zzX9C.zzH("HTML Keyboard", 100);
        zzX9C.zzH("HTML Sample", 102);
        zzX9C.zzH("HTML Typewriter", 103);
        zzX9C.zzH("HTML Variable", 104);
        zzX9C.zzH("Hyperlink", 85);
        zzX9C.zzH("Intense Emphasis", StyleIdentifier.INTENSE_EMPHASIS);
        zzX9C.zzH("Intense Reference", StyleIdentifier.INTENSE_REFERENCE);
        zzX9C.zzH("line number", 40);
        zzX9C.zzH("page number", 41);
        zzX9C.zzH("Placeholder Text", 156);
        zzX9C.zzH("Smart Link", StyleIdentifier.SMART_LINK);
        zzX9C.zzH("Strong", 87);
        zzX9C.zzH("Subtle Emphasis", StyleIdentifier.SUBTLE_EMPHASIS);
        zzX9C.zzH("Subtle Reference", StyleIdentifier.SUBTLE_REFERENCE);
        zzX9C.zzH("Balloon Text", 153);
        zzX9C.zzH("Body Text", 66);
        zzX9C.zzH("Body Text 2", 80);
        zzX9C.zzH("Body Text 3", 81);
        zzX9C.zzH("Body Text First Indent", 77);
        zzX9C.zzH("Body Text First Indent 2", 78);
        zzX9C.zzH("Body Text Indent", 67);
        zzX9C.zzH("Body Text Indent 2", 82);
        zzX9C.zzH("Body Text Indent 3", 83);
        zzX9C.zzH("Closing", 63);
        zzX9C.zzH("annotation subject", 106);
        zzX9C.zzH("annotation text", 30);
        zzX9C.zzH("Date", 76);
        zzX9C.zzH("Document Map", 89);
        zzX9C.zzH("E-mail Signature", 91);
        zzX9C.zzH("endnote text", 43);
        zzX9C.zzH("footer", 32);
        zzX9C.zzH("footnote text", 29);
        zzX9C.zzH("header", 31);
        zzX9C.zzH("heading 1", 1);
        zzX9C.zzH("heading 2", 2);
        zzX9C.zzH("heading 3", 3);
        zzX9C.zzH("heading 4", 4);
        zzX9C.zzH("heading 5", 5);
        zzX9C.zzH("heading 6", 6);
        zzX9C.zzH("heading 7", 7);
        zzX9C.zzH("heading 8", 8);
        zzX9C.zzH("heading 9", 9);
        zzX9C.zzH("HTML Address", 96);
        zzX9C.zzH("HTML Bottom of Form", 93);
        zzX9C.zzH("HTML Preformatted", 101);
        zzX9C.zzH("HTML Top of Form", 92);
        zzX9C.zzH("Intense Quote", 181);
        zzX9C.zzH("macro", 45);
        zzX9C.zzH("Message Header", 73);
        zzX9C.zzH("Note Heading", 79);
        zzX9C.zzH("Plain Text", 90);
        zzX9C.zzH("Quote", 180);
        zzX9C.zzH("Salutation", 75);
        zzX9C.zzH(RequestParameters.SIGNATURE, 64);
        zzX9C.zzH("Subtitle", 74);
        zzX9C.zzH("Title", 62);
        zzX9C.zzH("Bibliography", StyleIdentifier.BIBLIOGRAPHY);
        zzX9C.zzH("Block Text", 84);
        zzX9C.zzH("caption", 34);
        zzX9C.zzH("envelope address", 36);
        zzX9C.zzH("envelope return", 37);
        zzX9C.zzH("index 1", 10);
        zzX9C.zzH("index 2", 11);
        zzX9C.zzH("index 3", 12);
        zzX9C.zzH("index 4", 13);
        zzX9C.zzH("index 5", 14);
        zzX9C.zzH("index 6", 15);
        zzX9C.zzH("index 7", 16);
        zzX9C.zzH("index 8", 17);
        zzX9C.zzH("index 9", 18);
        zzX9C.zzH("index heading", 33);
        zzX9C.zzH("List", 47);
        zzX9C.zzH("List 2", 50);
        zzX9C.zzH("List 3", 51);
        zzX9C.zzH("List 4", 52);
        zzX9C.zzH("List 5", 53);
        zzX9C.zzH("List Bullet", 48);
        zzX9C.zzH("List Bullet 2", 54);
        zzX9C.zzH("List Bullet 3", 55);
        zzX9C.zzH("List Bullet 4", 56);
        zzX9C.zzH("List Bullet 5", 57);
        zzX9C.zzH("List Continue", 68);
        zzX9C.zzH("List Continue 2", 69);
        zzX9C.zzH("List Continue 3", 70);
        zzX9C.zzH("List Continue 4", 71);
        zzX9C.zzH("List Continue 5", 72);
        zzX9C.zzH("List Number", 49);
        zzX9C.zzH("List Number 2", 58);
        zzX9C.zzH("List Number 3", 59);
        zzX9C.zzH("List Number 4", 60);
        zzX9C.zzH("List Number 5", 61);
        zzX9C.zzH("List Paragraph", 179);
        zzX9C.zzH("No Spacing", 157);
        zzX9C.zzH("Normal", 0);
        zzX9C.zzH("Normal (Web)", 94);
        zzX9C.zzH("Normal Indent", 28);
        zzX9C.zzH("Revision", 178);
        zzX9C.zzH("table of authorities", 44);
        zzX9C.zzH("table of figures", 35);
        zzX9C.zzH("toa heading", 46);
        zzX9C.zzH("toc 1", 19);
        zzX9C.zzH("toc 2", 20);
        zzX9C.zzH("toc 3", 21);
        zzX9C.zzH("toc 4", 22);
        zzX9C.zzH("toc 5", 23);
        zzX9C.zzH("toc 6", 24);
        zzX9C.zzH("toc 7", 25);
        zzX9C.zzH("toc 8", 26);
        zzX9C.zzH("toc 9", 27);
        zzX9C.zzH("TOC Heading", StyleIdentifier.TOC_HEADING);
        zzX9C.zzH("Outline List 1", 108);
        zzX9C.zzH("Outline List 2", 109);
        zzX9C.zzH("Outline List 3", 110);
        zzX9C.zzH("No List", 107);
        zzX9C.zzH("Colorful Grid", 171);
        zzX9C.zzH("Colorful Grid Accent 1", 189);
        zzX9C.zzH("Colorful Grid Accent 2", 203);
        zzX9C.zzH("Colorful Grid Accent 3", 217);
        zzX9C.zzH("Colorful Grid Accent 4", 231);
        zzX9C.zzH("Colorful Grid Accent 5", 245);
        zzX9C.zzH("Colorful Grid Accent 6", StyleIdentifier.COLORFUL_GRID_ACCENT_6);
        zzX9C.zzH("Colorful List", 170);
        zzX9C.zzH("Colorful List Accent 1", 188);
        zzX9C.zzH("Colorful List Accent 2", 202);
        zzX9C.zzH("Colorful List Accent 3", 216);
        zzX9C.zzH("Colorful List Accent 4", 230);
        zzX9C.zzH("Colorful List Accent 5", 244);
        zzX9C.zzH("Colorful List Accent 6", StyleIdentifier.COLORFUL_LIST_ACCENT_6);
        zzX9C.zzH("Colorful Shading", 169);
        zzX9C.zzH("Colorful Shading Accent 1", 187);
        zzX9C.zzH("Colorful Shading Accent 2", 201);
        zzX9C.zzH("Colorful Shading Accent 3", 215);
        zzX9C.zzH("Colorful Shading Accent 4", 229);
        zzX9C.zzH("Colorful Shading Accent 5", 243);
        zzX9C.zzH("Colorful Shading Accent 6", 257);
        zzX9C.zzH("Dark List", 168);
        zzX9C.zzH("Dark List Accent 1", 186);
        zzX9C.zzH("Dark List Accent 2", 200);
        zzX9C.zzH("Dark List Accent 3", 214);
        zzX9C.zzH("Dark List Accent 4", 228);
        zzX9C.zzH("Dark List Accent 5", 242);
        zzX9C.zzH("Dark List Accent 6", 256);
        zzX9C.zzH("Light Grid", 160);
        zzX9C.zzH("Light Grid Accent 1", 174);
        zzX9C.zzH("Light Grid Accent 2", 192);
        zzX9C.zzH("Light Grid Accent 3", 206);
        zzX9C.zzH("Light Grid Accent 4", 220);
        zzX9C.zzH("Light Grid Accent 5", 234);
        zzX9C.zzH("Light Grid Accent 6", StyleIdentifier.LIGHT_GRID_ACCENT_6);
        zzX9C.zzH("Light List", 159);
        zzX9C.zzH("Light List Accent 1", 173);
        zzX9C.zzH("Light List Accent 2", 191);
        zzX9C.zzH("Light List Accent 3", 205);
        zzX9C.zzH("Light List Accent 4", 219);
        zzX9C.zzH("Light List Accent 5", 233);
        zzX9C.zzH("Light List Accent 6", StyleIdentifier.LIGHT_LIST_ACCENT_6);
        zzX9C.zzH("Light Shading", 158);
        zzX9C.zzH("Light Shading Accent 1", 172);
        zzX9C.zzH("Light Shading Accent 2", 190);
        zzX9C.zzH("Light Shading Accent 3", 204);
        zzX9C.zzH("Light Shading Accent 4", 218);
        zzX9C.zzH("Light Shading Accent 5", 232);
        zzX9C.zzH("Light Shading Accent 6", 246);
        zzX9C.zzH("Medium Grid 1", 165);
        zzX9C.zzH("Medium Grid 1 Accent 1", 183);
        zzX9C.zzH("Medium Grid 1 Accent 2", 197);
        zzX9C.zzH("Medium Grid 1 Accent 3", 211);
        zzX9C.zzH("Medium Grid 1 Accent 4", 225);
        zzX9C.zzH("Medium Grid 1 Accent 5", 239);
        zzX9C.zzH("Medium Grid 1 Accent 6", StyleIdentifier.MEDIUM_GRID_1_ACCENT_6);
        zzX9C.zzH("Medium Grid 2", 166);
        zzX9C.zzH("Medium Grid 2 Accent 1", 184);
        zzX9C.zzH("Medium Grid 2 Accent 2", 198);
        zzX9C.zzH("Medium Grid 2 Accent 3", 212);
        zzX9C.zzH("Medium Grid 2 Accent 4", 226);
        zzX9C.zzH("Medium Grid 2 Accent 5", 240);
        zzX9C.zzH("Medium Grid 2 Accent 6", StyleIdentifier.MEDIUM_GRID_2_ACCENT_6);
        zzX9C.zzH("Medium Grid 3", 167);
        zzX9C.zzH("Medium Grid 3 Accent 1", 185);
        zzX9C.zzH("Medium Grid 3 Accent 2", 199);
        zzX9C.zzH("Medium Grid 3 Accent 3", 213);
        zzX9C.zzH("Medium Grid 3 Accent 4", 227);
        zzX9C.zzH("Medium Grid 3 Accent 5", 241);
        zzX9C.zzH("Medium Grid 3 Accent 6", 255);
        zzX9C.zzH("Medium List 1", 163);
        zzX9C.zzH("Medium List 1 Accent 1", 177);
        zzX9C.zzH("Medium List 1 Accent 2", 195);
        zzX9C.zzH("Medium List 1 Accent 3", 209);
        zzX9C.zzH("Medium List 1 Accent 4", 223);
        zzX9C.zzH("Medium List 1 Accent 5", 237);
        zzX9C.zzH("Medium List 1 Accent 6", StyleIdentifier.MEDIUM_LIST_1_ACCENT_6);
        zzX9C.zzH("Medium List 2", 164);
        zzX9C.zzH("Medium List 2 Accent 1", 182);
        zzX9C.zzH("Medium List 2 Accent 2", 196);
        zzX9C.zzH("Medium List 2 Accent 3", 210);
        zzX9C.zzH("Medium List 2 Accent 4", 224);
        zzX9C.zzH("Medium List 2 Accent 5", 238);
        zzX9C.zzH("Medium List 2 Accent 6", StyleIdentifier.MEDIUM_LIST_2_ACCENT_6);
        zzX9C.zzH("Medium Shading 1", 161);
        zzX9C.zzH("Medium Shading 1 Accent 1", 175);
        zzX9C.zzH("Medium Shading 1 Accent 2", 193);
        zzX9C.zzH("Medium Shading 1 Accent 3", 207);
        zzX9C.zzH("Medium Shading 1 Accent 4", 221);
        zzX9C.zzH("Medium Shading 1 Accent 5", 235);
        zzX9C.zzH("Medium Shading 1 Accent 6", StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6);
        zzX9C.zzH("Medium Shading 2", 162);
        zzX9C.zzH("Medium Shading 2 Accent 1", 176);
        zzX9C.zzH("Medium Shading 2 Accent 2", 194);
        zzX9C.zzH("Medium Shading 2 Accent 3", 208);
        zzX9C.zzH("Medium Shading 2 Accent 4", 222);
        zzX9C.zzH("Medium Shading 2 Accent 5", 236);
        zzX9C.zzH("Medium Shading 2 Accent 6", 250);
        zzX9C.zzH("Table 3D effects 1", 142);
        zzX9C.zzH("Table 3D effects 2", 143);
        zzX9C.zzH("Table 3D effects 3", 144);
        zzX9C.zzH("Table Classic 1", 114);
        zzX9C.zzH("Table Classic 2", 115);
        zzX9C.zzH("Table Classic 3", 116);
        zzX9C.zzH("Table Classic 4", 117);
        zzX9C.zzH("Table Colorful 1", 118);
        zzX9C.zzH("Table Colorful 2", 119);
        zzX9C.zzH("Table Colorful 3", 120);
        zzX9C.zzH("Table Columns 1", 121);
        zzX9C.zzH("Table Columns 2", 122);
        zzX9C.zzH("Table Columns 3", 123);
        zzX9C.zzH("Table Columns 4", 124);
        zzX9C.zzH("Table Columns 5", 125);
        zzX9C.zzH("Table Contemporary", 145);
        zzX9C.zzH("Table Elegant", 146);
        zzX9C.zzH("Table Grid", 154);
        zzX9C.zzH("Table Grid 1", 126);
        zzX9C.zzH("Table Grid 2", 127);
        zzX9C.zzH("Table Grid 3", 128);
        zzX9C.zzH("Table Grid 4", 129);
        zzX9C.zzH("Table Grid 5", 130);
        zzX9C.zzH("Table Grid 6", 131);
        zzX9C.zzH("Table Grid 7", 132);
        zzX9C.zzH("Table Grid 8", 133);
        zzX9C.zzH("Table List 1", 134);
        zzX9C.zzH("Table List 2", 135);
        zzX9C.zzH("Table List 3", 136);
        zzX9C.zzH("Table List 4", 137);
        zzX9C.zzH("Table List 5", 138);
        zzX9C.zzH("Table List 6", 139);
        zzX9C.zzH("Table List 7", 140);
        zzX9C.zzH("Table List 8", 141);
        zzX9C.zzH("Normal Table", 105);
        zzX9C.zzH("Table Professional", 147);
        zzX9C.zzH("Table Simple 1", 111);
        zzX9C.zzH("Table Simple 2", 112);
        zzX9C.zzH("Table Simple 3", 113);
        zzX9C.zzH("Table Subtle 1", 148);
        zzX9C.zzH("Table Subtle 2", 149);
        zzX9C.zzH("Table Theme", 155);
        zzX9C.zzH("Table Web 1", 150);
        zzX9C.zzH("Table Web 2", 151);
        zzX9C.zzH("Table Web 3", 152);
        zzX9C.zzH("Plain Table 1", StyleIdentifier.PLAIN_TABLE_1);
        zzX9C.zzH("Plain Table 2", StyleIdentifier.PLAIN_TABLE_2);
        zzX9C.zzH("Plain Table 3", StyleIdentifier.PLAIN_TABLE_3);
        zzX9C.zzH("Plain Table 4", 270);
        zzX9C.zzH("Plain Table 5", StyleIdentifier.PLAIN_TABLE_5);
        zzX9C.zzH("Grid Table Light", StyleIdentifier.TABLE_GRID_LIGHT);
        zzX9C.zzH("Grid Table 1 Light", StyleIdentifier.GRID_TABLE_1_LIGHT);
        zzX9C.zzH("Grid Table 2", StyleIdentifier.GRID_TABLE_2);
        zzX9C.zzH("Grid Table 3", StyleIdentifier.GRID_TABLE_3);
        zzX9C.zzH("Grid Table 4", StyleIdentifier.GRID_TABLE_4);
        zzX9C.zzH("Grid Table 5 Dark", StyleIdentifier.GRID_TABLE_5_DARK);
        zzX9C.zzH("Grid Table 6 Colorful", StyleIdentifier.GRID_TABLE_6_COLORFUL);
        zzX9C.zzH("Grid Table 7 Colorful", StyleIdentifier.GRID_TABLE_7_COLORFUL);
        zzX9C.zzH("Grid Table 1 Light Accent 1", StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1);
        zzX9C.zzH("Grid Table 2 Accent 1", StyleIdentifier.GRID_TABLE_2_ACCENT_1);
        zzX9C.zzH("Grid Table 3 Accent 1", StyleIdentifier.GRID_TABLE_3_ACCENT_1);
        zzX9C.zzH("Grid Table 4 Accent 1", StyleIdentifier.GRID_TABLE_4_ACCENT_1);
        zzX9C.zzH("Grid Table 5 Dark Accent 1", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1);
        zzX9C.zzH("Grid Table 6 Colorful Accent 1", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1);
        zzX9C.zzH("Grid Table 7 Colorful Accent 1", StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1);
        zzX9C.zzH("Grid Table 1 Light Accent 2", StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2);
        zzX9C.zzH("Grid Table 2 Accent 2", StyleIdentifier.GRID_TABLE_2_ACCENT_2);
        zzX9C.zzH("Grid Table 3 Accent 2", StyleIdentifier.GRID_TABLE_3_ACCENT_2);
        zzX9C.zzH("Grid Table 4 Accent 2", StyleIdentifier.GRID_TABLE_4_ACCENT_2);
        zzX9C.zzH("Grid Table 5 Dark Accent 2", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2);
        zzX9C.zzH("Grid Table 6 Colorful Accent 2", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2);
        zzX9C.zzH("Grid Table 7 Colorful Accent 2", StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2);
        zzX9C.zzH("Grid Table 1 Light Accent 3", StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3);
        zzX9C.zzH("Grid Table 2 Accent 3", StyleIdentifier.GRID_TABLE_2_ACCENT_3);
        zzX9C.zzH("Grid Table 3 Accent 3", StyleIdentifier.GRID_TABLE_3_ACCENT_3);
        zzX9C.zzH("Grid Table 4 Accent 3", StyleIdentifier.GRID_TABLE_4_ACCENT_3);
        zzX9C.zzH("Grid Table 5 Dark Accent 3", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3);
        zzX9C.zzH("Grid Table 6 Colorful Accent 3", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3);
        zzX9C.zzH("Grid Table 7 Colorful Accent 3", 300);
        zzX9C.zzH("Grid Table 1 Light Accent 4", 301);
        zzX9C.zzH("Grid Table 2 Accent 4", 302);
        zzX9C.zzH("Grid Table 3 Accent 4", 303);
        zzX9C.zzH("Grid Table 4 Accent 4", 304);
        zzX9C.zzH("Grid Table 5 Dark Accent 4", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4);
        zzX9C.zzH("Grid Table 6 Colorful Accent 4", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4);
        zzX9C.zzH("Grid Table 7 Colorful Accent 4", 307);
        zzX9C.zzH("Grid Table 1 Light Accent 5", 308);
        zzX9C.zzH("Grid Table 2 Accent 5", StyleIdentifier.GRID_TABLE_2_ACCENT_5);
        zzX9C.zzH("Grid Table 3 Accent 5", StyleIdentifier.GRID_TABLE_3_ACCENT_5);
        zzX9C.zzH("Grid Table 4 Accent 5", StyleIdentifier.GRID_TABLE_4_ACCENT_5);
        zzX9C.zzH("Grid Table 5 Dark Accent 5", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5);
        zzX9C.zzH("Grid Table 6 Colorful Accent 5", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5);
        zzX9C.zzH("Grid Table 7 Colorful Accent 5", StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5);
        zzX9C.zzH("Grid Table 1 Light Accent 6", 315);
        zzX9C.zzH("Grid Table 2 Accent 6", StyleIdentifier.GRID_TABLE_2_ACCENT_6);
        zzX9C.zzH("Grid Table 3 Accent 6", StyleIdentifier.GRID_TABLE_3_ACCENT_6);
        zzX9C.zzH("Grid Table 4 Accent 6", StyleIdentifier.GRID_TABLE_4_ACCENT_6);
        zzX9C.zzH("Grid Table 5 Dark Accent 6", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6);
        zzX9C.zzH("Grid Table 6 Colorful Accent 6", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6);
        zzX9C.zzH("Grid Table 7 Colorful Accent 6", StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6);
        zzX9C.zzH("List Table 1 Light", StyleIdentifier.LIST_TABLE_1_LIGHT);
        zzX9C.zzH("List Table 2", StyleIdentifier.LIST_TABLE_2);
        zzX9C.zzH("List Table 3", StyleIdentifier.LIST_TABLE_3);
        zzX9C.zzH("List Table 4", StyleIdentifier.LIST_TABLE_4);
        zzX9C.zzH("List Table 5 Dark", StyleIdentifier.LIST_TABLE_5_DARK);
        zzX9C.zzH("List Table 6 Colorful", StyleIdentifier.LIST_TABLE_6_COLORFUL);
        zzX9C.zzH("List Table 7 Colorful", StyleIdentifier.LIST_TABLE_7_COLORFUL);
        zzX9C.zzH("List Table 1 Light Accent 1", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1);
        zzX9C.zzH("List Table 2 Accent 1", StyleIdentifier.LIST_TABLE_2_ACCENT_1);
        zzX9C.zzH("List Table 3 Accent 1", StyleIdentifier.LIST_TABLE_3_ACCENT_1);
        zzX9C.zzH("List Table 4 Accent 1", StyleIdentifier.LIST_TABLE_4_ACCENT_1);
        zzX9C.zzH("List Table 5 Dark Accent 1", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1);
        zzX9C.zzH("List Table 6 Colorful Accent 1", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1);
        zzX9C.zzH("List Table 7 Colorful Accent 1", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1);
        zzX9C.zzH("List Table 1 Light Accent 2", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2);
        zzX9C.zzH("List Table 2 Accent 2", StyleIdentifier.LIST_TABLE_2_ACCENT_2);
        zzX9C.zzH("List Table 3 Accent 2", StyleIdentifier.LIST_TABLE_3_ACCENT_2);
        zzX9C.zzH("List Table 4 Accent 2", StyleIdentifier.LIST_TABLE_4_ACCENT_2);
        zzX9C.zzH("List Table 5 Dark Accent 2", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2);
        zzX9C.zzH("List Table 6 Colorful Accent 2", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2);
        zzX9C.zzH("List Table 7 Colorful Accent 2", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2);
        zzX9C.zzH("List Table 1 Light Accent 3", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3);
        zzX9C.zzH("List Table 2 Accent 3", StyleIdentifier.LIST_TABLE_2_ACCENT_3);
        zzX9C.zzH("List Table 3 Accent 3", StyleIdentifier.LIST_TABLE_3_ACCENT_3);
        zzX9C.zzH("List Table 4 Accent 3", StyleIdentifier.LIST_TABLE_4_ACCENT_3);
        zzX9C.zzH("List Table 5 Dark Accent 3", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3);
        zzX9C.zzH("List Table 6 Colorful Accent 3", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3);
        zzX9C.zzH("List Table 7 Colorful Accent 3", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3);
        zzX9C.zzH("List Table 1 Light Accent 4", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        zzX9C.zzH("List Table 2 Accent 4", StyleIdentifier.LIST_TABLE_2_ACCENT_4);
        zzX9C.zzH("List Table 3 Accent 4", StyleIdentifier.LIST_TABLE_3_ACCENT_4);
        zzX9C.zzH("List Table 4 Accent 4", StyleIdentifier.LIST_TABLE_4_ACCENT_4);
        zzX9C.zzH("List Table 5 Dark Accent 4", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4);
        zzX9C.zzH("List Table 6 Colorful Accent 4", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4);
        zzX9C.zzH("List Table 7 Colorful Accent 4", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4);
        zzX9C.zzH("List Table 1 Light Accent 5", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5);
        zzX9C.zzH("List Table 2 Accent 5", StyleIdentifier.LIST_TABLE_2_ACCENT_5);
        zzX9C.zzH("List Table 3 Accent 5", StyleIdentifier.LIST_TABLE_3_ACCENT_5);
        zzX9C.zzH("List Table 4 Accent 5", StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        zzX9C.zzH("List Table 5 Dark Accent 5", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_5);
        zzX9C.zzH("List Table 6 Colorful Accent 5", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5);
        zzX9C.zzH("List Table 7 Colorful Accent 5", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5);
        zzX9C.zzH("List Table 1 Light Accent 6", StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6);
        zzX9C.zzH("List Table 2 Accent 6", StyleIdentifier.LIST_TABLE_2_ACCENT_6);
        zzX9C.zzH("List Table 3 Accent 6", StyleIdentifier.LIST_TABLE_3_ACCENT_6);
        zzX9C.zzH("List Table 4 Accent 6", StyleIdentifier.LIST_TABLE_4_ACCENT_6);
        zzX9C.zzH("List Table 5 Dark Accent 6", StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6);
        zzX9C.zzH("List Table 6 Colorful Accent 6", StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6);
        zzX9C.zzH("List Table 7 Colorful Accent 6", StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
        zzX9C.zzH("Mention", StyleIdentifier.MENTION);
        zzX9C.zzH("Smart Hyperlink", StyleIdentifier.SMART_HYPERLINK);
        zzX9C.zzH("Hashtag", StyleIdentifier.HASHTAG);
        zzX9C.zzH("Unresolved Mention", StyleIdentifier.UNRESOLVED_MENTION);
        zzXQr.zzY("annotation reference", "Comment Reference");
        zzXQr.zzY("endnote reference", "Endnote Reference");
        zzXQr.zzY("footnote reference", "Footnote Reference");
        zzXQr.zzY("line number", "Line Number");
        zzXQr.zzY("page number", "Page Number");
        zzXQr.zzY("annotation subject", "Comment Subject");
        zzXQr.zzY("annotation text", "Comment Text");
        zzXQr.zzY("caption", "Caption");
        zzXQr.zzY("endnote text", "Endnote Text");
        zzXQr.zzY("envelope address", "Envelope Address");
        zzXQr.zzY("envelope return", "Envelope Return");
        zzXQr.zzY("footer", "Footer");
        zzXQr.zzY("footnote text", "Footnote Text");
        zzXQr.zzY("header", "Header");
        zzXQr.zzY("heading 1", "Heading 1");
        zzXQr.zzY("heading 2", "Heading 2");
        zzXQr.zzY("heading 3", "Heading 3");
        zzXQr.zzY("heading 4", "Heading 4");
        zzXQr.zzY("heading 5", "Heading 5");
        zzXQr.zzY("heading 6", "Heading 6");
        zzXQr.zzY("heading 7", "Heading 7");
        zzXQr.zzY("heading 8", "Heading 8");
        zzXQr.zzY("heading 9", "Heading 9");
        zzXQr.zzY("index 1", "Index 1");
        zzXQr.zzY("index 2", "Index 2");
        zzXQr.zzY("index 3", "Index 3");
        zzXQr.zzY("index 4", "Index 4");
        zzXQr.zzY("index 5", "Index 5");
        zzXQr.zzY("index 6", "Index 6");
        zzXQr.zzY("index 7", "Index 7");
        zzXQr.zzY("index 8", "Index 8");
        zzXQr.zzY("index 9", "Index 9");
        zzXQr.zzY("index heading", "Index Heading");
        zzXQr.zzY("macro", "Macro");
        zzXQr.zzY("note heading", "Note Heading");
        zzXQr.zzY("table of authorities", "Table of Authorities");
        zzXQr.zzY("table of figures", "Table of Figures");
        zzXQr.zzY("toa heading", "TOA Heading");
        zzXQr.zzY("toc 1", "TOC 1");
        zzXQr.zzY("toc 2", "TOC 2");
        zzXQr.zzY("toc 3", "TOC 3");
        zzXQr.zzY("toc 4", "TOC 4");
        zzXQr.zzY("toc 5", "TOC 5");
        zzXQr.zzY("toc 6", "TOC 6");
        zzXQr.zzY("toc 7", "TOC 7");
        zzXQr.zzY("toc 8", "TOC 8");
        zzXQr.zzY("toc 9", "TOC 9");
        zzXQr.zzY("Outline List 1", "1 / a / i");
        zzXQr.zzY("Outline List 2", "1 / 1.1 / 1.1.1");
        zzXQr.zzY("Outline List 3", "Article / Section");
        zzXQr.zzY("Normal Table", "Table Normal");
        zzX9B.zzH("1024x768", 4);
        zzX9B.zzH("1152x882", 5);
        zzX9B.zzH("1152x900", 6);
        zzX9B.zzH("1280x1024", 7);
        zzX9B.zzH("1600x1200", 8);
        zzX9B.zzH("1800x1440", 9);
        zzX9B.zzH("1920x1200", 10);
        zzX9B.zzH("544x376", 0);
        zzX9B.zzH("640x480", 1);
        zzX9B.zzH("720x512", 2);
        zzX9B.zzH("800x600", 3);
        zzUR = new com.aspose.words.internal.zzZHW("flatBorders", "noBorder", "cols", "rows", "band1Horz", "band1Vert", "band2Horz", "band2Vert", "firstCol", "firstRow", "lastCol", "lastRow", "neCell", "nwCell", "seCell", "swCell", "wholeTable", "pct", "dxa", "auto", "nil", "clear", "solid", "horzStripe", "horz-stripe", "vertStripe", "vert-stripe", "reverseDiagStripe", "reverse-diag-stripe", "diagStripe", "diag-stripe", "horzCross", "horz-cross", "diagCross", "diag-cross", "thinHorzStripe", "thin-horz-stripe", "thinVertStripe", "thin-vert-stripe", "thinReverseDiagStripe", "thin-reverse-diag-stripe", "thinDiagStripe", "thin-diag-stripe", "thinHorzCross", "thin-horz-cross", "thinDiagCross", "thin-diag-cross", "pct5", "pct-5", "pct10", "pct-10", "pct12", "pct-12", "pct15", "pct-15", "pct20", "pct-20", "pct25", "pct-25", "pct30", "pct-30", "pct35", "pct-35", "pct37", "pct-37", "pct40", "pct-40", "pct45", "pct-45", "pct50", "pct-50", "pct55", "pct-55", "pct60", "pct-60", "pct62", "pct-62", "pct65", "pct-65", "pct70", "pct-70", "pct75", "pct-75", "pct80", "pct-80", "pct85", "pct-85", "pct87", "pct-87", "pct90", "pct-90", "pct95", "pct-95", "lr", "btLr", "bt-lr", "tb", "lrTb", "lr-tb", "tbV", "lrTbV", "lr-tb-v", "rlV", "tbRlV", "tb-rl-v", "rl", "tbRl", "tb-rl", "tb-lr-v", "tbLrV", "lrV");
    }

    public static int zzAK(String str) {
        switch (zzUR.zzTP(str)) {
            case 20:
                return 65535;
            case 21:
            default:
                return 0;
            case 22:
                return 1;
            case 23:
            case 24:
                return 14;
            case 25:
            case 26:
                return 15;
            case 27:
            case 28:
                return 16;
            case 29:
            case 30:
                return 17;
            case 31:
            case 32:
                return 18;
            case 33:
            case 34:
                return 19;
            case 35:
            case 36:
                return 20;
            case 37:
            case 38:
                return 21;
            case 39:
            case 40:
                return 22;
            case 41:
            case 42:
                return 23;
            case 43:
            case 44:
                return 24;
            case 45:
            case 46:
                return 25;
            case 47:
            case 48:
                return 2;
            case 49:
            case 50:
                return 3;
            case 51:
            case 52:
                return 37;
            case 53:
            case 54:
                return 38;
            case 55:
            case 56:
                return 4;
            case 57:
            case 58:
                return 5;
            case 59:
            case 60:
                return 6;
            case 61:
            case 62:
                return 43;
            case 63:
            case 64:
                return 44;
            case 65:
            case 66:
                return 7;
            case 67:
            case 68:
                return 46;
            case 69:
            case 70:
                return 8;
            case 71:
            case 72:
                return 49;
            case 73:
            case 74:
                return 9;
            case 75:
            case 76:
                return 51;
            case 77:
            case 78:
                return 52;
            case 79:
            case 80:
                return 10;
            case 81:
            case 82:
                return 11;
            case 83:
            case 84:
                return 12;
            case 85:
            case 86:
                return 57;
            case 87:
            case 88:
                return 58;
            case 89:
            case 90:
                return 13;
            case 91:
            case 92:
                return 60;
        }
    }

    public static int zzAL(String str) {
        int iZzTP = zzUR.zzTP(str.toLowerCase());
        if (iZzTP == 17) {
            return 2;
        }
        if (iZzTP != 18) {
            return iZzTP != 20 ? 1 : 0;
        }
        return 3;
    }

    public static int zzAM(String str) {
        return zzX9B.zzG(str, 3);
    }

    public static String zzAN(String str) {
        return zzXQr.zzS(str, str);
    }

    public static String zzAO(String str) {
        return zzXQr.zzX(str, str);
    }

    public static int zzAP(String str) {
        return zzX9C.zzG(str, StyleIdentifier.USER);
    }

    public static int zzAQ(String str) {
        if (com.aspose.words.internal.zzZKN.zzX(str, "column", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return 1;
        }
        return zzHy(str);
    }

    public static int zzAR(String str) {
        return zzZ4M.zzG(str, 2);
    }

    public static int zzAS(String str) {
        return zzZ4P.zzG(str, 1);
    }

    public static int zzAT(String str) {
        return zzZ4O.zzG(str, 1);
    }

    public static int zzAU(String str) {
        return zzXQo.zzG(str, 0);
    }

    public static int zzAV(String str) {
        switch (zzUR.zzTP(str)) {
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 2;
            case 9:
                return 1;
            case 10:
                return 4;
            case 11:
                return 3;
            case 12:
                return 10;
            case 13:
                return 9;
            case 14:
                return 12;
            case 15:
                return 11;
            case 16:
                return 13;
            default:
                return 0;
        }
    }

    public static int zzAW(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 2) {
            return iZzTP != 3 ? -1 : 0;
        }
        return 1;
    }

    public static int zzAX(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? 2 : 0;
        }
        return 1;
    }

    public static int zzHA(String str) {
        return zzZ6C.zzG(str, 0);
    }

    public static int zzHx(String str) {
        return zzZ4M.zzG(str, 0);
    }

    public static int zzHy(String str) {
        return zzZ4N.zzG(str, 2);
    }

    public static int zzHz(String str) {
        return zzZ4L.zzG(str, 0);
    }

    public static int zzP(String str, zzYO3 zzyo3) {
        switch (zzUR.zzTP(str)) {
            case 93:
                zzyo3.zzYrc();
                return 3;
            case 94:
            case 95:
                return 3;
            case 96:
                zzyo3.zzYrc();
                return 0;
            case 97:
            case 98:
            default:
                return 0;
            case 99:
                zzyo3.zzYrc();
                return 4;
            case 100:
            case 101:
                return 4;
            case 102:
                zzyo3.zzYrc();
                return 5;
            case 103:
            case 104:
                return 5;
            case 105:
                zzyo3.zzYrc();
                return 1;
            case 106:
            case 107:
                return 1;
            case 110:
                zzyo3.zzYrc();
            case 108:
            case 109:
                return 7;
        }
    }

    public static String zzR(int i, boolean z, int i2) {
        boolean z2 = z && i2 == 2;
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "" : z ? z2 ? "lrV" : "tbLrV" : "tb-lr-v" : z ? z2 ? "rlV" : "tbRlV" : "tb-rl-v" : z ? z2 ? "tbV" : "lrTbV" : "lr-tb-v" : z ? z2 ? "lr" : "btLr" : "bt-lr" : z ? z2 ? "rl" : "tbRl" : "tb-rl" : z ? z2 ? "tb" : "lrTb" : "lr-tb";
    }

    public static String zzZ6(int i, boolean z) {
        switch (i) {
            case 0:
                return "clear";
            case 1:
                return "solid";
            case 2:
                return z ? "pct5" : "pct-5";
            case 3:
                return z ? "pct10" : "pct-10";
            case 4:
                return z ? "pct20" : "pct-20";
            case 5:
                return z ? "pct25" : "pct-25";
            case 6:
                return z ? "pct30" : "pct-30";
            case 7:
                return z ? "pct40" : "pct-40";
            case 8:
                return z ? "pct50" : "pct-50";
            case 9:
                return z ? "pct60" : "pct-60";
            case 10:
                return z ? "pct70" : "pct-70";
            case 11:
                return z ? "pct75" : "pct-75";
            case 12:
                return z ? "pct80" : "pct-80";
            case 13:
                return z ? "pct90" : "pct-90";
            case 14:
                return z ? "horzStripe" : "horz-stripe";
            case 15:
                return z ? "vertStripe" : "vert-stripe";
            case 16:
                return z ? "reverseDiagStripe" : "reverse-diag-stripe";
            case 17:
                return z ? "diagStripe" : "diag-stripe";
            case 18:
                return z ? "horzCross" : "horz-cross";
            case 19:
                return z ? "diagCross" : "diag-cross";
            case 20:
                return z ? "thinHorzStripe" : "thin-horz-stripe";
            case 21:
                return z ? "thinVertStripe" : "thin-vert-stripe";
            case 22:
                return z ? "thinReverseDiagStripe" : "thin-reverse-diag-stripe";
            case 23:
                return z ? "thinDiagStripe" : "thin-diag-stripe";
            case 24:
                return z ? "thinHorzCross" : "thin-horz-cross";
            case 25:
                return z ? "thinDiagCross" : "thin-diag-cross";
            default:
                switch (i) {
                    case 35:
                        return z ? "pct5" : "pct-5";
                    case 36:
                        return z ? "pct10" : "pct-10";
                    case 37:
                        return z ? "pct12" : "pct-12";
                    case 38:
                        return z ? "pct15" : "pct-15";
                    case 39:
                        return z ? "pct20" : "pct-20";
                    case 40:
                        return z ? "pct25" : "pct-25";
                    case 41:
                        return z ? "pct30" : "pct-30";
                    case 42:
                        return z ? "pct35" : "pct-35";
                    case 43:
                        return z ? "pct35" : "pct-35";
                    case 44:
                        return z ? "pct37" : "pct-37";
                    case 45:
                        return z ? "pct40" : "pct-40";
                    case 46:
                        return z ? "pct45" : "pct-45";
                    case 47:
                        return z ? "pct45" : "pct-45";
                    case 48:
                        return z ? "pct50" : "pct-50";
                    case 49:
                        return z ? "pct55" : "pct-55";
                    case 50:
                        return z ? "pct55" : "pct-55";
                    case 51:
                        return z ? "pct62" : "pct-62";
                    case 52:
                        return z ? "pct65" : "pct-65";
                    case 53:
                        return z ? "pct65" : "pct-65";
                    case 54:
                        return z ? "pct70" : "pct-70";
                    case 55:
                        return z ? "pct80" : "pct-80";
                    case 56:
                        return z ? "pct85" : "pct-85";
                    case 57:
                        return z ? "pct85" : "pct-85";
                    case 58:
                        return z ? "pct87" : "pct-87";
                    case 59:
                        return z ? "pct90" : "pct-90";
                    case 60:
                        return z ? "pct95" : "pct-95";
                    case 61:
                        return z ? "pct95" : "pct-95";
                    default:
                        return "nil";
                }
        }
    }

    public static String zzh(int i, String str) {
        return zzX9C.zzO(i, str);
    }

    public static int zzkM(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 1 : 4;
        }
        return 3;
    }

    public static int zzkN(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 2 : 5;
        }
        return 4;
    }

    public static String zzkO(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "dxa" : "pct" : "auto";
    }

    public static String zzkP(int i) {
        return zzX9B.zzO(i, "");
    }

    public static String zzkQ(int i) {
        return zzZ4P.zzO(i, "");
    }

    public static String zzkR(int i) {
        return zzZ4O.zzO(i, "");
    }

    public static String zzkS(int i) {
        return zzXQo.zzO(i, "");
    }

    public static String zzkT(int i) {
        switch (i) {
            case 1:
                return "firstRow";
            case 2:
                return "firstCol";
            case 3:
                return "lastRow";
            case 4:
                return "lastCol";
            case 5:
                return "band1Horz";
            case 6:
                return "band1Vert";
            case 7:
                return "band2Horz";
            case 8:
                return "band2Vert";
            case 9:
                return "nwCell";
            case 10:
                return "neCell";
            case 11:
                return "swCell";
            case 12:
                return "seCell";
            default:
                return "wholeTable";
        }
    }

    public static String zzkU(int i) {
        return i != 0 ? i != 1 ? "" : "cols" : "rows";
    }

    public static String zzkV(int i) {
        return i != 0 ? i != 1 ? "" : "flatBorders" : "noBorder";
    }

    public static String zzta(int i) {
        return zzZ4M.zzO(i, "");
    }

    public static String zztb(int i) {
        return zzZ4N.zzO(i, "");
    }

    public static String zztc(int i) {
        return zzZ4L.zzO(i, "");
    }

    public static String zztd(int i) {
        return zzZ6C.zzO(i, "");
    }
}
