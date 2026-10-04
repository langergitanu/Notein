package o00ooOo;

import android.util.Log;
import com.facebook.soloader.AbstractC22320OooOoO0;
import com.facebook.soloader.C22318OooOo0o;
import com.facebook.soloader.C22319OooOoO;

/* JADX INFO: renamed from: o00ooOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25786OooO0oo implements InterfaceC25783OooO0o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00ooOo.InterfaceC25783OooO0o
    public final boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        String str = unsatisfiedLinkError instanceof C22318OooOo0o ? ((C22318OooOo0o) unsatisfiedLinkError).f67512OooOo0o : null;
        StringBuilder sb = new StringBuilder("Waiting on SoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (C22319OooOoO c22319OooOoO : abstractC22320OooOoO0Arr) {
            if (c22319OooOoO instanceof com.facebook.soloader.OooO0O0) {
                Log.e("SoLoader", "Waiting on SoSource ".concat(c22319OooOoO.OooO0OO()));
                ((com.facebook.soloader.OooO0O0) c22319OooOoO).OooO00o();
            }
        }
        return true;
    }
}
