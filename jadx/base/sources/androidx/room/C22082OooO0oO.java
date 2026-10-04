package androidx.room;

import android.os.Looper;
import androidx.room.AbstractC22083OooO0oo;
import androidx.room.OooO0OO;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: androidx.room.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22082OooO0oO extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AbstractC22083OooO0oo<Object> f66219OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22082OooO0oO(String[] strArr, AbstractC22083OooO0oo<Object> abstractC22083OooO0oo) {
        super(strArr);
        this.f66219OooO0O0 = abstractC22083OooO0oo;
    }

    @Override // androidx.room.OooO0OO.OooO00o
    public final void OooO00o(Set<String> tables) {
        OooOOO0.OooO0oO(tables, "tables");
        OooOOO0.OooO0O0 oooO0O0Oooo = OooOOO0.OooO0O0.Oooo();
        final AbstractC22083OooO0oo<Object> abstractC22083OooO0oo = this.f66219OooO0O0;
        Runnable runnable = new Runnable() { // from class: o000oo0.OooOooO
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22083OooO0oo abstractC22083OooO0oo2 = abstractC22083OooO0oo;
                boolean z = abstractC22083OooO0oo2.f65576OooO0OO > 0;
                if (abstractC22083OooO0oo2.f66223OooOOOO.compareAndSet(false, true) && z) {
                    C33609OooO0oo.OooO0OO(abstractC22083OooO0oo2.f66220OooOO0o.OooO(), abstractC22083OooO0oo2.f66225OooOOo, null, new C24680OooOoo(abstractC22083OooO0oo2, null), 2);
                }
            }
        };
        oooO0O0Oooo.f58406OooOo0o.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            oooO0O0Oooo.OoooO00(runnable);
        }
    }
}
