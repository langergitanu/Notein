package oO0O00o;

import java.util.Random;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends AbstractC32515OooO00o {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f116799OooOoO0 = new OooO00o();

    public static final class OooO00o extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // oO0O00o.AbstractC32515OooO00o
    public final Random OooO0O0() {
        Random random = this.f116799OooOoO0.get();
        OooOOO0.OooO0o(random, "get(...)");
        return random;
    }
}
