package o000000o;

import OooO0Oo.C20398OooO0O0;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o000000o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24093OooOOo0 implements Comparable<C24093OooOOo0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C24093OooOOo0 f81189OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C24093OooOOo0 f81190OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C24093OooOOo0 f81191OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final List<C24093OooOOo0> f81192OooOoOO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f81193OooOo0o;

    static {
        C24093OooOOo0 c24093OooOOo0 = new C24093OooOOo0(100);
        C24093OooOOo0 c24093OooOOo02 = new C24093OooOOo0(200);
        C24093OooOOo0 c24093OooOOo03 = new C24093OooOOo0(300);
        C24093OooOOo0 c24093OooOOo04 = new C24093OooOOo0(400);
        C24093OooOOo0 c24093OooOOo05 = new C24093OooOOo0(500);
        C24093OooOOo0 c24093OooOOo06 = new C24093OooOOo0(600);
        f81189OooOo = c24093OooOOo06;
        C24093OooOOo0 c24093OooOOo07 = new C24093OooOOo0(LogSeverity.ALERT_VALUE);
        C24093OooOOo0 c24093OooOOo08 = new C24093OooOOo0(LogSeverity.EMERGENCY_VALUE);
        C24093OooOOo0 c24093OooOOo09 = new C24093OooOOo0(SQLitePersistence.MAX_ARGS);
        f81191OooOoO0 = c24093OooOOo04;
        f81190OooOoO = c24093OooOOo05;
        f81192OooOoOO = C34429OooOOo0.OooOO0o(c24093OooOOo0, c24093OooOOo02, c24093OooOOo03, c24093OooOOo04, c24093OooOOo05, c24093OooOOo06, c24093OooOOo07, c24093OooOOo08, c24093OooOOo09);
    }

    public C24093OooOOo0(int i) {
        this.f81193OooOo0o = i;
        if (1 > i || i >= 1001) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C24093OooOOo0 other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return kotlin.jvm.internal.OooOOO0.OooO(this.f81193OooOo0o, other.f81193OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24093OooOOo0) {
            return this.f81193OooOo0o == ((C24093OooOOo0) obj).f81193OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81193OooOo0o;
    }

    public final String toString() {
        return C20398OooO0O0.OooO00o(')', new StringBuilder("FontWeight(weight="), this.f81193OooOo0o);
    }
}
