package o0Oo0O0;

import android.view.View;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo000;

/* JADX INFO: renamed from: o0Oo0O0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28050OooO0OO {
    public static final void OooO00o(View view, final long j, final View.OnClickListener onClickListener) {
        OooOOO0.OooO0oO(view, "<this>");
        final Oooo000 oooo000 = new Oooo000();
        view.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0O0.OooO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Oooo000 oooo0002 = oooo000;
                if (jCurrentTimeMillis - oooo0002.f80941OooOo0o >= j) {
                    oooo0002.f80941OooOo0o = jCurrentTimeMillis;
                    onClickListener.onClick(view2);
                }
            }
        });
    }
}
