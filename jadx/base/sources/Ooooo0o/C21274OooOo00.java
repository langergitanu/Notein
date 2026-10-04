package Ooooo0o;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Ooooo0o.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21274OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C21274OooOo00 f61678OooO0O0 = new C21274OooOo00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C21274OooOo00 f61679OooO0OO = new C21274OooOo00();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooO0O0<InterfaceC21275OooOo0O> f61680OooO00o = new Oooo.OooO0O0<>(new InterfaceC21275OooOo0O[16]);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(InterfaceC32507OooOO0o<? super FocusTargetModifierNode, Boolean> onFound) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(onFound, "onFound");
        if (equals(f61678OooO0O0)) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (equals(f61679OooO0OO)) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        Oooo.OooO0O0<InterfaceC21275OooOo0O> oooO0O0 = this.f61680OooO00o;
        if (!oooO0O0.OooOO0()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i = oooO0O0.f59746OooOoO0;
        int i2 = 0;
        if (i <= 0) {
            return false;
        }
        InterfaceC21275OooOo0O[] interfaceC21275OooOo0OArr = oooO0O0.f59745OooOo0o;
        boolean z = false;
        do {
            InterfaceC21275OooOo0O interfaceC21275OooOo0O = interfaceC21275OooOo0OArr[i2];
            if (!interfaceC21275OooOo0O.getNode().f61612Oooo000) {
                throw new IllegalStateException("Check failed.");
            }
            Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
            InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC21275OooOo0O.getNode().f61607OooOoOO;
            if (oooO0OO == null) {
                o00oO0O.OooO.OooO00o(oooO0O02, interfaceC21275OooOo0O.getNode());
            } else {
                oooO0O02.OooO0O0(oooO0OO);
            }
            while (true) {
                if (!oooO0O02.OooOO0()) {
                    break;
                }
                InterfaceC21233OooO0o.OooO0OO oooO0OO2 = (InterfaceC21233OooO0o.OooO0OO) oooO0O02.OooOO0o(oooO0O02.f59746OooOoO0 - 1);
                if ((oooO0OO2.f61606OooOoO0 & 1024) == 0) {
                    o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO2);
                } else {
                    while (true) {
                        if (oooO0OO2 == null) {
                            break;
                        }
                        if ((oooO0OO2.f61603OooOo & 1024) == 0) {
                            oooO0OO2 = oooO0OO2.f61607OooOoOO;
                        } else if ((oooO0OO2 instanceof FocusTargetModifierNode) && onFound.invoke((FocusTargetModifierNode) oooO0OO2).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            i2++;
        } while (i2 < i);
        return z;
    }
}
