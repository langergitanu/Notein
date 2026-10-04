package oO0OoO0;

import java.util.ArrayList;
import oO0O0OO.InterfaceC32596OooO0o0;

/* JADX INFO: renamed from: oO0OoO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33242OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f120305OooO00o = new OooO00o();

    /* JADX INFO: renamed from: oO0OoO0.OooOOo0$OooO00o */
    public static class OooO00o implements InterfaceC33242OooOOo0 {
        public static /* synthetic */ void OooO0OO(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // oO0OoO0.InterfaceC33242OooOOo0
        public final void OooO00o(oO0O0OO.OooO0O0 oooO0O0) {
            if (oooO0O0 != null) {
                return;
            }
            OooO0OO(2);
            throw null;
        }

        @Override // oO0OoO0.InterfaceC33242OooOOo0
        public final void OooO0O0(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, ArrayList arrayList) {
            if (interfaceC32596OooO0o0 != null) {
                return;
            }
            OooO0OO(0);
            throw null;
        }
    }

    void OooO00o(oO0O0OO.OooO0O0 oooO0O0);

    void OooO0O0(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, ArrayList arrayList);
}
