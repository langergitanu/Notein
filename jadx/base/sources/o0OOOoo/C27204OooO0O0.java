package o0OOOoo;

import Oooo0oO.C21023OooO0Oo;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27204OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static PenInfo f94997OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static PenInfo f94998OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f94999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f95000OooO0O0;

    /* JADX INFO: renamed from: o0OOOoo.OooO0O0$OooO00o */
    public static final class OooO00o {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static PenInfo OooO00o(int i, PenInfo penInfo, PenInfo penInfo2, List list, oO0O000o.OooO00o oooO00o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
            switch (i) {
                case 1:
                    if (!list.isEmpty()) {
                        int i2 = 0;
                        List listO00O0O = OooOo.o00O0O(list, new C27203OooO00o(C34429OooOOo0.OooOO0o(0, 1, 10, 2, 9, 11, 8, 7, 12)));
                        Iterator it = listO00O0O.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                            } else if (!((PenInfo) it.next()).getSelected()) {
                                i2++;
                            }
                        }
                        return (PenInfo) listO00O0O.get((i2 + 1) % list.size());
                    }
                case 2:
                    if ((penInfo.getType() == 0 || penInfo.getType() == 1 || penInfo.getType() == 10 || penInfo.getType() == 2 || penInfo.getType() == 9 || penInfo.getType() == 7 || penInfo.getType() == 8 || penInfo.getType() == 3 || penInfo.getType() == 11 || penInfo.getType() == 12) && !penInfo.getColorList().isEmpty()) {
                        return PenInfo.copy$default(penInfo, null, 0, (penInfo.getColorIndex() + 1) % penInfo.getColorList().size(), 0, null, null, null, false, null, 507, null);
                    }
                case 3:
                    if (penInfo.getType() == 0 || penInfo.getType() == 1 || penInfo.getType() == 10 || penInfo.getType() == 2 || penInfo.getType() == 9 || penInfo.getType() == 7 || penInfo.getType() == 8 || penInfo.getType() == 3 || penInfo.getType() == 11 || penInfo.getType() == 12) {
                        return PenInfo.copy$default(penInfo, null, 0, 0, (penInfo.getWidthIndex() + 1) % 3, null, null, null, false, null, 503, null);
                    }
                case 4:
                    if (penInfo.getType() == 3) {
                        PenInfo penInfo3 = C27204OooO0O0.f94997OooO0OO;
                        C27204OooO0O0.f94997OooO0OO = null;
                        return penInfo3 == null ? penInfo : penInfo3;
                    }
                    C27204OooO0O0.f94997OooO0OO = penInfo;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        PenInfo penInfo4 = (PenInfo) it2.next();
                        if (penInfo4.getType() == 3) {
                            return penInfo4;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                case 5:
                    if (penInfo.getType() != 4) {
                        C27204OooO0O0.f94998OooO0Oo = penInfo;
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            PenInfo penInfo5 = (PenInfo) it3.next();
                            if (penInfo5.getType() == 4) {
                                return penInfo5;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    PenInfo penInfo6 = C27204OooO0O0.f94998OooO0Oo;
                    C27204OooO0O0.f94998OooO0Oo = null;
                    if (penInfo6 != null) {
                        return penInfo6;
                    }
                    break;
                case 6:
                    oooO00o.invoke();
                    return penInfo;
                case 7:
                    if (penInfo2 != null) {
                        return penInfo2;
                    }
                    break;
            }
        }
    }

    public C27204OooO0O0(String key, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        this.f94999OooO00o = key;
        this.f95000OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27204OooO0O0)) {
            return false;
        }
        C27204OooO0O0 c27204OooO0O0 = (C27204OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f94999OooO00o, c27204OooO0O0.f94999OooO00o) && this.f95000OooO0O0 == c27204OooO0O0.f95000OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95000OooO0O0) + (this.f94999OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PenButtonEventSetting(key=");
        sb.append(this.f94999OooO00o);
        sb.append(", value=");
        return C21023OooO0Oo.OooO0OO(")", this.f95000OooO0O0, sb);
    }
}
