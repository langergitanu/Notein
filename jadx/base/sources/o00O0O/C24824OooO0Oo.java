package o00O0O;

import OoooOoO.InterfaceC21233OooO0o;
import android.view.KeyEvent;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24824OooO0Oo extends InterfaceC21233OooO0o.OooO0OO implements InterfaceC24825OooO0o0 {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Object f84204Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooOOOO f84205Oooo00o;

    /* JADX WARN: Multi-variable type inference failed */
    public C24824OooO0Oo(InterfaceC32507OooOO0o<? super OooO0O0, Boolean> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super OooO0O0, Boolean> interfaceC32507OooOO0o2) {
        this.f84204Oooo00O = interfaceC32507OooOO0o;
        this.f84205Oooo00o = (OooOOOO) interfaceC32507OooOO0o2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // o00O0O.InterfaceC24825OooO0o0
    public final boolean OooOO0(KeyEvent keyEvent) {
        ?? r0 = this.f84205Oooo00o;
        if (r0 != 0) {
            return ((Boolean) r0.invoke(new OooO0O0(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO0O000o.OooOO0o] */
    @Override // o00O0O.InterfaceC24825OooO0o0
    public final boolean OooOo0O(KeyEvent keyEvent) {
        ?? r0 = this.f84204Oooo00O;
        if (r0 != 0) {
            return ((Boolean) r0.invoke(new OooO0O0(keyEvent))).booleanValue();
        }
        return false;
    }
}
