package Ooooo0o;

import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import java.util.Arrays;
import java.util.Comparator;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.C25503OooOoOO;

/* JADX INFO: renamed from: Ooooo0o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21281OooOoo0 implements Comparator<FocusTargetModifierNode> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C21281OooOoo0 f61692OooOo0o = new C21281OooOoo0();

    @Override // java.util.Comparator
    public final int compare(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode;
        FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode2;
        if (focusTargetModifierNode3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (focusTargetModifierNode4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = 0;
        if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode3) && C21279OooOoOO.OooO0Oo(focusTargetModifierNode4)) {
            AbstractC25521OoooO abstractC25521OoooO = focusTargetModifierNode3.f61608OooOoo;
            C25503OooOoOO c25503OooOoOOOooOOoo = abstractC25521OoooO != null ? abstractC25521OoooO.f87051OooOoo : null;
            if (c25503OooOoOOOooOOoo == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC25521OoooO abstractC25521OoooO2 = focusTargetModifierNode4.f61608OooOoo;
            C25503OooOoOO c25503OooOoOOOooOOoo2 = abstractC25521OoooO2 != null ? abstractC25521OoooO2.f87051OooOoo : null;
            if (c25503OooOoOOOooOOoo2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!c25503OooOoOOOooOOoo.equals(c25503OooOoOOOooOOoo2)) {
                Object[] objArrCopyOf = new C25503OooOoOO[16];
                int i2 = 0;
                while (c25503OooOoOOOooOOoo != null) {
                    int i3 = i2 + 1;
                    if (objArrCopyOf.length < i3) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i3, objArrCopyOf.length * 2));
                        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                    }
                    if (i2 != 0) {
                        Oooo.OooO0OO.OooO0oo(objArrCopyOf, 0 + 1, objArrCopyOf, 0, i2);
                    }
                    objArrCopyOf[0] = c25503OooOoOOOooOOoo;
                    i2++;
                    c25503OooOoOOOooOOoo = c25503OooOoOOOooOOoo.OooOOoo();
                }
                Object[] objArrCopyOf2 = new C25503OooOoOO[16];
                int i4 = 0;
                while (c25503OooOoOOOooOOoo2 != null) {
                    int i5 = i4 + 1;
                    if (objArrCopyOf2.length < i5) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i5, objArrCopyOf2.length * 2));
                        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
                    }
                    if (i4 != 0) {
                        Oooo.OooO0OO.OooO0oo(objArrCopyOf2, 0 + 1, objArrCopyOf2, 0, i4);
                    }
                    objArrCopyOf2[0] = c25503OooOoOOOooOOoo2;
                    i4++;
                    c25503OooOoOOOooOOoo2 = c25503OooOoOOOooOOoo2.OooOOoo();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.OooOOO0.OooO0O0(objArrCopyOf[i], objArrCopyOf2[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.OooOOO0.OooO(((C25503OooOoOO) objArrCopyOf[i]).f86955Oooo0oO, ((C25503OooOoOO) objArrCopyOf2[i]).f86955Oooo0oO);
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode3)) {
                return -1;
            }
            if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
