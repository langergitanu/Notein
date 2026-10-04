package oO000Oo;

import com.google.common.base.Preconditions;
import java.text.MessageFormat;
import java.util.logging.Level;
import oO0OOo0o.AbstractC33061OooO0o0;
import oO0OOo0o.C33077OooOoo;
import oO0OOo0o.C33082Oooo00O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 extends AbstractC33061OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f113989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32050o0000oOo f113990OooO0O0;

    public OooOOO0(OooOOOO oooOOOO, InterfaceC32050o0000oOo interfaceC32050o0000oOo) {
        this.f113989OooO00o = (OooOOOO) Preconditions.checkNotNull(oooOOOO, "tracer");
        this.f113990OooO0O0 = (InterfaceC32050o0000oOo) Preconditions.checkNotNull(interfaceC32050o0000oOo, "time");
    }

    public static Level OooO0Oo(AbstractC33061OooO0o0.OooO00o oooO00o) {
        int iOrdinal = oooO00o.ordinal();
        return iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // oO0OOo0o.AbstractC33061OooO0o0
    public final void OooO00o(AbstractC33061OooO0o0.OooO00o oooO00o, String str) {
        OooOOOO oooOOOO = this.f113989OooO00o;
        C33082Oooo00O c33082Oooo00O = oooOOOO.f113993OooO0O0;
        Level levelOooO0Oo = OooO0Oo(oooO00o);
        if (OooOOOO.f113991OooO0OO.isLoggable(levelOooO0Oo)) {
            OooOOOO.OooO00o(c33082Oooo00O, levelOooO0Oo, str);
        }
        if (!OooO0OO(oooO00o) || oooO00o == AbstractC33061OooO0o0.OooO00o.f119544OooOo0o) {
            return;
        }
        int iOrdinal = oooO00o.ordinal();
        C33077OooOoo.OooO00o oooO00o2 = iOrdinal != 2 ? iOrdinal != 3 ? C33077OooOoo.OooO00o.f119601OooOo0o : C33077OooOoo.OooO00o.f119603OooOoO0 : C33077OooOoo.OooO00o.f119600OooOo;
        long jOooO00o = this.f113990OooO0O0.OooO00o();
        Long lValueOf = Long.valueOf(jOooO00o);
        Preconditions.checkNotNull(str, "description");
        Preconditions.checkNotNull(oooO00o2, "severity");
        Preconditions.checkNotNull(lValueOf, "timestampNanos");
        Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        new C33077OooOoo(str, oooO00o2, jOooO00o, null);
        synchronized (oooOOOO.f113992OooO00o) {
        }
    }

    @Override // oO0OOo0o.AbstractC33061OooO0o0
    public final void OooO0O0(AbstractC33061OooO0o0.OooO00o oooO00o, String str, Object... objArr) {
        OooO00o(oooO00o, (OooO0OO(oooO00o) || OooOOOO.f113991OooO0OO.isLoggable(OooO0Oo(oooO00o))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean OooO0OO(AbstractC33061OooO0o0.OooO00o oooO00o) {
        if (oooO00o != AbstractC33061OooO0o0.OooO00o.f119544OooOo0o) {
            synchronized (this.f113989OooO00o.f113992OooO00o) {
            }
        }
        return false;
    }
}
