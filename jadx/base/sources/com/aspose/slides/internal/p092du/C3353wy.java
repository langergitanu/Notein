package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.wy */
/* JADX INFO: loaded from: classes3.dex */
public class C3353wy extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9716k4 = new C7017h4("inline", "block", "list-item", "inline-block", "run-in", "compact", "table", "inline-table", "table-row-group", "table-header-group", "table-footer-group", "table-row", "table-column-group", "table-column", "table-cell", "table-caption", "ruby", "ruby-base", "ruby-text", "ruby-base-group", "ruby-text-group", "grid", "inline-grid", "none");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "inline";
            case 1:
                return "block";
            case 2:
                return "list-item";
            case 3:
                return "inline-block";
            case 4:
                return "run-in";
            case 5:
                return "compact";
            case 6:
                return "table";
            case 7:
                return "inline-table";
            case 8:
                return "table-row-group";
            case 9:
                return "table-header-group";
            case 10:
                return "table-footer-group";
            case 11:
                return "table-row";
            case 12:
                return "table-column-group";
            case 13:
                return "table-column";
            case 14:
                return "table-cell";
            case 15:
                return "table-caption";
            case 16:
                return "ruby";
            case 17:
                return "ruby-base";
            case 18:
                return "ruby-text";
            case 19:
                return "ruby-base-group";
            case 20:
                return "ruby-text-group";
            case 21:
                return "none";
            case 22:
                return "grid";
            case 23:
                return "inline-grid";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9716k4.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                iArr[0] = 0;
                return true;
            case 1:
                iArr[0] = 1;
                return true;
            case 2:
                iArr[0] = 2;
                return true;
            case 3:
                iArr[0] = 3;
                return true;
            case 4:
                iArr[0] = 4;
                return true;
            case 5:
                iArr[0] = 5;
                return true;
            case 6:
                iArr[0] = 6;
                return true;
            case 7:
                iArr[0] = 7;
                return true;
            case 8:
                iArr[0] = 8;
                return true;
            case 9:
                iArr[0] = 9;
                return true;
            case 10:
                iArr[0] = 10;
                return true;
            case 11:
                iArr[0] = 11;
                return true;
            case 12:
                iArr[0] = 12;
                return true;
            case 13:
                iArr[0] = 13;
                return true;
            case 14:
                iArr[0] = 14;
                return true;
            case 15:
                iArr[0] = 15;
                return true;
            case 16:
                iArr[0] = 16;
                return true;
            case 17:
                iArr[0] = 17;
                return true;
            case 18:
                iArr[0] = 18;
                return true;
            case 19:
                iArr[0] = 19;
                return true;
            case 20:
                iArr[0] = 20;
                return true;
            case 21:
                iArr[0] = 22;
                return true;
            case 22:
                iArr[0] = 23;
                return true;
            case 23:
                iArr[0] = 21;
                return true;
            default:
                throw new ArgumentException(ResponseType.TOKEN);
        }
    }
}
