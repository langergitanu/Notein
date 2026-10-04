package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4279jd {

    /* JADX INFO: renamed from: c5 */
    private final C4288qq f11678c5;

    /* JADX INFO: renamed from: du */
    private final C4288qq f11679du;

    /* JADX INFO: renamed from: dy */
    private final C4288qq f11680dy;

    /* JADX INFO: renamed from: h4 */
    private final C4288qq f11681h4;

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1984kk f11682k4;

    /* JADX INFO: renamed from: kk */
    private int f11683kk = -1;

    /* JADX INFO: renamed from: m9 */
    private final C4288qq f11684m9;

    /* JADX INFO: renamed from: to */
    private C4299um f11685to;

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1986to f11686x1;

    private C4279jd(C4299um c4299um, C4288qq c4288qq, C4288qq c4288qq2, C4288qq c4288qq3, C4288qq c4288qq4, C4288qq c4288qq5, InterfaceC1984kk interfaceC1984kk, InterfaceC1986to interfaceC1986to) {
        this.f11685to = c4299um;
        this.f11679du = c4288qq;
        this.f11681h4 = c4288qq2;
        this.f11684m9 = c4288qq3;
        this.f11680dy = c4288qq4;
        this.f11678c5 = c4288qq5;
        this.f11682k4 = interfaceC1984kk;
        this.f11686x1 = interfaceC1986to;
    }

    /* JADX INFO: renamed from: to */
    private String[] m17244to() {
        List<AbstractC4282kp> listMo17208t_ = this.f11685to.mo17208t_();
        String[] strArr = new String[listMo17208t_.size()];
        int size = listMo17208t_.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = listMo17208t_.get_Item(i).mo9926j_();
        }
        return strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4279jd c4279jd = (C4279jd) C7019kk.m27452k4(obj, C4279jd.class);
        return c4279jd != null && C10017to.m49170k4(this.f11685to, c4279jd.f11685to) && C10017to.m49170k4(this.f11679du, c4279jd.f11679du) && C10017to.m49170k4(this.f11682k4, c4279jd.f11682k4) && C10017to.m49170k4(this.f11686x1, c4279jd.f11686x1) && C10017to.m49170k4(this.f11681h4, c4279jd.f11681h4) && C10017to.m49170k4(this.f11684m9, c4279jd.f11684m9) && C10017to.m49170k4(this.f11680dy, c4279jd.f11680dy) && C10017to.m49170k4(this.f11678c5, c4279jd.f11678c5);
    }

    public final int hashCode() {
        if (this.f11683kk == -1) {
            this.f11683kk = C10017to.m49168k4(this.f11678c5) + ((C10017to.m49168k4(this.f11680dy) + ((C10017to.m49168k4(this.f11684m9) + ((C10017to.m49168k4(this.f11681h4) + ((C10017to.m49168k4(this.f11679du) + ((C10017to.m49168k4(this.f11685to) + ((C10017to.m49168k4(this.f11686x1) + ((C10017to.m49168k4(this.f11682k4) + 629) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37);
        }
        return this.f11683kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17245k4() {
        return this.f11684m9.mo17251du();
    }

    /* JADX INFO: renamed from: kk */
    public final int m17247kk() {
        return this.f11678c5.mo17251du();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17248x1() {
        return this.f11680dy.mo17251du();
    }

    /* JADX INFO: renamed from: k4 */
    public static C4279jd m17243k4(AbstractC3533um abstractC3533um) {
        return new C4279jd((C4299um) abstractC3533um.m14402to(101), (C4288qq) abstractC3533um.m14402to(102), (C4288qq) abstractC3533um.m14402to(105), (C4288qq) abstractC3533um.m14402to(106), (C4288qq) abstractC3533um.m14402to(107), (C4288qq) abstractC3533um.m14402to(108), abstractC3533um.m14402to(103).mo9877dy(), abstractC3533um.m14402to(104).mo9878h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final C10155jd[] m17246k4(C10159m9 c10159m9) {
        String str;
        int i = 400;
        switch (this.f11678c5.mo17251du()) {
            case 169:
                i = 100;
                break;
            case 170:
                i = 200;
                break;
            case 171:
                i = 300;
                break;
            case 173:
                i = 500;
                break;
            case 174:
                i = 600;
                break;
            case 175:
                i = LogSeverity.ALERT_VALUE;
                break;
            case 176:
                i = LogSeverity.EMERGENCY_VALUE;
                break;
            case 177:
                i = SQLitePersistence.MAX_ARGS;
                break;
        }
        switch (this.f11684m9.mo17251du()) {
            case 164:
                str = "italic";
                break;
            case 165:
                str = "oblique";
                break;
            case 166:
                str = "backslant";
                break;
            default:
                str = "normal";
                break;
        }
        return c10159m9.m49963k4(m17244to(), str, i, this.f11680dy.mo17251du());
    }
}
