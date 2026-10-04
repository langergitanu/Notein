package com.aspose.slides.internal.p125f9;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p393s7.C10163x1;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.internal.ViewUtils;
import com.nimbusds.jose.shaded.json.parser.JSONParser;

/* JADX INFO: renamed from: com.aspose.slides.internal.f9.ks */
/* JADX INFO: loaded from: classes.dex */
public class C3888ks extends AbstractC3886k4 {

    /* JADX INFO: renamed from: kk */
    private static final int[] f10614kk = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, StyleIdentifier.GRID_TABLE_6_COLORFUL, 974, 961, 974, 980, 719, 789, 790, 791, 690, JSONParser.MODE_JSON_SIMPLE, 939, 549, 855, 911, 933, 911, 945, 974, 755, 846, 762, 761, 571, 677, 763, 760, 759, 754, 494, 552, 537, 577, 692, 786, 788, 788, 790, 793, 794, 816, 823, 789, 841, 823, 833, 816, 831, 923, 744, 723, 749, 790, 792, 695, 776, ViewUtils.EDGE_TO_EDGE_FLAGS, 792, 759, 707, 708, 682, 701, 826, 815, 789, 789, 707, 687, 696, 689, 786, 787, 713, 791, 785, 791, 873, 761, 762, 762, 759, 759, 892, 892, 788, 784, 438, 138, StyleIdentifier.GRID_TABLE_5_DARK, 415, 392, 392, 668, 668, 0, 390, 390, StyleIdentifier.GRID_TABLE_3_ACCENT_6, StyleIdentifier.GRID_TABLE_3_ACCENT_6, StyleIdentifier.GRID_TABLE_4, StyleIdentifier.GRID_TABLE_4, 509, 509, 410, 410, 234, 234, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 732, 544, 544, 910, 667, 760, 760, 776, 595, 694, 626, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 788, 894, 838, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 458, 748, 924, 748, 918, 927, 928, 928, 834, 873, 828, 924, 924, 917, 930, 931, 463, 883, 836, 836, 867, 867, 696, 696, 874, 0, 874, 760, 946, 771, 865, 771, 888, 967, 888, 831, 873, 927, 970, 918, 0};

    /* JADX INFO: renamed from: x1 */
    private static final List<String> f10615x1;

    /* JADX INFO: renamed from: to */
    private final C10163x1 f10616to;

    static {
        List<String> list = new List<>();
        f10615x1 = list;
        list.addItem("ZapfDingbats");
    }

    public C3888ks() {
        this(false);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public int mo15564du(int i) {
        return i * 426;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public int mo15566k4(int i) {
        m49988h4();
        int iM49941k4 = this.f10616to.m49941k4(i);
        if (iM49941k4 != 0) {
            return iM49941k4;
        }
        m49989h4(i);
        return 35;
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: kk */
    public int mo15570kk(int i) {
        return i * 820;
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public int mo15572to(int i) {
        return i * (-143);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public int mo15574x1(int i) {
        return i * 820;
    }

    public C3888ks(boolean z) {
        this.f10616to = C10163x1.m49987k4("ZapfDingbatsEncoding");
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public Dictionary<Integer, Dictionary<Integer, Integer>> mo15565du() {
        return new Dictionary<>();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: k4 */
    public int mo15567k4(int i, int i2) {
        return i2 * f10614kk[i];
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: kk */
    public String mo15571kk() {
        return "ITC Zapf Dingbats";
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public boolean mo15573to() {
        return false;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6, com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public String mo15575x1() {
        return "ZapfDingbats";
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public String mo15568k4() {
        return "ZapfDingbatsEncoding";
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public boolean mo15569k4(char c) {
        return this.f10616to.m49941k4(c) > 0;
    }
}
