package oO00Ooo;

import java.util.Collections;
import java.util.List;
import oO00Ooo0.C32309OooO00o;

/* JADX INFO: renamed from: oO00Ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32308OooOo0o {

    /* JADX INFO: renamed from: oO00Ooo.OooOo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C32298OooO0oO f116225OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32298OooO0oO f116226OooO00o;

        static {
            List list = Collections.EMPTY_LIST;
            if (list.size() > 32) {
                throw new IllegalStateException("Invalid size");
            }
            f116225OooO0O0 = new C32298OooO0oO(Collections.unmodifiableList(list));
        }

        public OooO00o(C32298OooO0oO c32298OooO0oO) {
            C32309OooO00o.OooO00o(c32298OooO0oO, "parent");
            this.f116226OooO00o = c32298OooO0oO;
        }
    }

    public abstract List<Object> OooO00o();
}
