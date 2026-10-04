package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEY {
    static boolean zzZD5 = false;
    private zzYEM zzXwl;

    public zzYEY(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zzG(zzY6G zzy6g) throws Exception {
        int horizontalAlignment;
        if (zzy6g.zzVE(4170)) {
            this.zzXwl.zzYfW().zzZ5(zzy6g.zzYpC() < 0 ? "\\tposnegx" : "\\tposx", zzy6g.zzYpC());
        }
        if (!zzy6g.zzXXg() || (horizontalAlignment = zzy6g.getHorizontalAlignment()) == 0) {
            return;
        }
        this.zzXwl.zzYfW().zzCD(zzYFQ.zzov(horizontalAlignment));
    }

    private void zzH(zzY6G zzy6g) throws Exception {
        if (zzy6g.zzVE(4190)) {
            this.zzXwl.zzYfW().zzZ5(zzy6g.zzYpB() < 0 ? "\\tposnegy" : "\\tposy", zzy6g.zzYpB());
        }
        if (zzy6g.zzXXh()) {
            int verticalAlignment = zzy6g.getVerticalAlignment();
            if (verticalAlignment != 0 && verticalAlignment != -1) {
                this.zzXwl.zzYfW().zzCD(zzYFQ.zzou(verticalAlignment));
            }
            if (verticalAlignment != -1 || zzy6g.zzVE(4340)) {
                return;
            }
            this.zzXwl.zzYfW().zzCD("\\tblind0\\tblindtype3");
        }
    }

    private void zzI(zzY6G zzy6g) throws Exception {
        zzG(zzy6g);
        zzH(zzy6g);
    }

    private void zzX(zzY6G zzy6g, boolean z) throws Exception {
        if (!z || zzy6g.zzVE(4120)) {
            int heightRule = zzy6g.getHeightRule();
            if (heightRule == 0) {
                this.zzXwl.zzYfW().zzZ5("\\trrh", zzy6g.getHeight());
            } else if (heightRule != 1) {
                this.zzXwl.zzYfW().zzZ5("\\trrh", 0);
            } else {
                this.zzXwl.zzYfW().zzZ5("\\trrh", -zzy6g.getHeight());
            }
        }
    }

    private void zzY(zzY6G zzy6g, boolean z) throws Exception {
        if (this.zzXwl.zzYen().getExportCompactSize()) {
            return;
        }
        if (!z || zzy6g.zzVE(4380)) {
            this.zzXwl.zzYfW().zzCD(zzy6g.getBidi() ? "\\rtlrow" : "\\ltrrow");
        }
    }

    public final void zzZ(zzY6G zzy6g, boolean z) throws Exception {
        zzY(zzy6g, z);
        for (int i = 0; i < zzy6g.getCount(); i++) {
            int iZzT3 = zzy6g.zzT3(i);
            Object objZzVY = zzy6g.zzVY(i);
            switch (iZzT3) {
                case 4005:
                    this.zzXwl.zzYfW().zzZ5("\\ts", ((Integer) objZzVY).intValue());
                    break;
                case 4010:
                    int iIntValue = ((Integer) objZzVY).intValue();
                    if (zzy6g.getBidi()) {
                        iIntValue = zzY6G.zzqE(iIntValue);
                    }
                    this.zzXwl.zzYfW().zzCD(zzYFQ.zzoe(iIntValue));
                    break;
                case 4020:
                    if (!z) {
                        this.zzXwl.zzYfW().zzZ5("\\trgaph", ((Integer) objZzVY).intValue());
                    }
                    this.zzXwl.zzYfW().zzZ5("\\trpaddl", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD("\\trpaddfl3");
                    break;
                case 4040:
                    this.zzXwl.zzYfW().zz7("\\trhdr", ((Boolean) objZzVY).booleanValue());
                    break;
                case 4050:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrt");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case 4060:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrl");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case 4070:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrb");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case 4080:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrr");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case 4090:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrh");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case EditingLanguage.CHINESE_SINGAPORE /* 4100 */:
                    if (objZzVY != null) {
                        this.zzXwl.zzYfW().zzCD("\\trbrdrv");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    }
                    break;
                case 4120:
                case 4140:
                case 4170:
                case 4180:
                case 4190:
                case 4200:
                case 4330:
                case 4340:
                case 4380:
                case 5000:
                case 5010:
                case 10010:
                    break;
                case 4150:
                    if (zzy6g.zzXXk()) {
                        this.zzXwl.zzYfW().zzCD(zzYFQ.zzox(((Integer) objZzVY).intValue()));
                    }
                    break;
                case 4160:
                    if (zzy6g.zzXXj()) {
                        this.zzXwl.zzYfW().zzCD(zzYFQ.zzow(((Integer) objZzVY).intValue()));
                    }
                    break;
                case 4210:
                    if (zzy6g.isFloating()) {
                        this.zzXwl.zzYfW().zzZ5("\\tdfrmtxtLeft", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4220:
                    if (zzy6g.isFloating()) {
                        this.zzXwl.zzYfW().zzZ5("\\tdfrmtxtTop", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4230:
                    this.zzXwl.zzYfW().zzZ("\\trwWidth", "\\trftsWidth", (PreferredWidth) objZzVY);
                    break;
                case 4240:
                    this.zzXwl.zzYfW().zz5("\\trautofit", ((Boolean) objZzVY).booleanValue());
                    break;
                case 4250:
                    PreferredWidth preferredWidth = (PreferredWidth) zzy6g.get(4253);
                    if (preferredWidth == null || !preferredWidth.zzYmB()) {
                        this.zzXwl.zzYfW().zzZ5("\\trwWidthB", ((Integer) objZzVY).intValue());
                        this.zzXwl.zzYfW().zzCD("\\trftsWidthB3");
                    } else {
                        this.zzXwl.zzYfW().zzZ5("\\trwWidthB", preferredWidth.zzYmE());
                        this.zzXwl.zzYfW().zzCD(com.aspose.words.internal.zzZKN.format("\\trftsWidthB{0}", Integer.valueOf(preferredWidth.getType())));
                    }
                    break;
                case 4260:
                    PreferredWidth preferredWidth2 = (PreferredWidth) zzy6g.get(4261);
                    if (preferredWidth2 == null || !preferredWidth2.zzYmB()) {
                        this.zzXwl.zzYfW().zzZ5("\\trwWidthA", ((Integer) objZzVY).intValue());
                        this.zzXwl.zzYfW().zzCD("\\trftsWidthA3");
                    } else {
                        this.zzXwl.zzYfW().zzZ5("\\trwWidthA", preferredWidth2.zzYmE());
                        this.zzXwl.zzYfW().zzCD(com.aspose.words.internal.zzZKN.format("\\trftsWidthA{0}", Integer.valueOf(preferredWidth2.getType())));
                    }
                    break;
                case 4270:
                    if (zzy6g.isFloating()) {
                        this.zzXwl.zzYfW().zzZ5("\\tdfrmtxtRight", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4280:
                    if (zzy6g.isFloating()) {
                        this.zzXwl.zzYfW().zzZ5("\\tdfrmtxtBottom", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4290:
                    PreferredWidth preferredWidth3 = (PreferredWidth) objZzVY;
                    this.zzXwl.zzYfW().zzZ5("\\trspdl", preferredWidth3.zzYmE());
                    this.zzXwl.zzYfW().zzZ5("\\trspdfl", preferredWidth3.getType());
                    this.zzXwl.zzYfW().zzZ5("\\trspdr", preferredWidth3.zzYmE());
                    this.zzXwl.zzYfW().zzZ5("\\trspdfr", preferredWidth3.getType());
                    this.zzXwl.zzYfW().zzZ5("\\trspdt", preferredWidth3.zzYmE());
                    this.zzXwl.zzYfW().zzZ5("\\trspdft", preferredWidth3.getType());
                    this.zzXwl.zzYfW().zzZ5("\\trspdb", preferredWidth3.zzYmE());
                    this.zzXwl.zzYfW().zzZ5("\\trspdfb", preferredWidth3.getType());
                    break;
                case 4300:
                    this.zzXwl.zzYfW().zzZ5("\\trpaddt", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD("\\trpaddft3");
                    break;
                case 4310:
                    this.zzXwl.zzYfW().zzZ5("\\trpaddb", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD("\\trpaddfb3");
                    break;
                case 4320:
                    this.zzXwl.zzYfW().zzZ5("\\trpaddr", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD("\\trpaddfr3");
                    break;
                case 4350:
                    if (zzy6g.isFloating()) {
                        this.zzXwl.zzYfW().zz5("\\tabsnoovrlp", !((Boolean) objZzVY).booleanValue());
                    }
                    break;
                case 4360:
                    this.zzXwl.zzYfW().zz7("\\trkeep", !((Boolean) objZzVY).booleanValue());
                    break;
                case 4500:
                    this.zzXwl.zzYfW().zzZ5("\\tscbandsh", ((Integer) objZzVY).intValue());
                    break;
                case 4510:
                    this.zzXwl.zzYfW().zzZ5("\\tscbandsv", ((Integer) objZzVY).intValue());
                    break;
                default:
                    if (zzZD5) {
                        com.aspose.words.internal.zzZKN.format("Unhandled table attribute: {0}", Integer.valueOf(iZzT3));
                    }
                    break;
            }
        }
        zzX(zzy6g, z);
        zzI(zzy6g);
    }
}
