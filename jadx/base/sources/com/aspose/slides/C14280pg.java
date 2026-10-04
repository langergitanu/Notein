package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;

/* JADX INFO: renamed from: com.aspose.slides.pg */
/* JADX INFO: loaded from: classes3.dex */
class C14280pg implements InterfaceC1130g3 {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f48049x1 = new C7017h4("$", "ppt_x", "#ppt_x", "ppt_y", "#ppt_y", "ppt_w", "#ppt_w", "ppt_h", "#ppt_h");

    /* JADX INFO: renamed from: k4 */
    public final String f48050k4;

    public C14280pg(String str) {
        this.f48050k4 = str;
    }

    @Override // com.aspose.slides.InterfaceC1130g3
    /* JADX INFO: renamed from: k4 */
    public final float mo6404k4(kdz kdzVar) {
        switch (f48049x1.m27428k4(this.f48050k4)) {
            case 0:
                return kdzVar.m63771du();
            case 1:
            case 2:
                return kdzVar.m63772k4();
            case 3:
            case 4:
                return kdzVar.m63775x1();
            case 5:
            case 6:
                return kdzVar.m63773kk();
            case 7:
            case 8:
                return kdzVar.m63774to();
            default:
                throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m69035k4(String str) {
        switch (f48049x1.m27428k4(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }
}
