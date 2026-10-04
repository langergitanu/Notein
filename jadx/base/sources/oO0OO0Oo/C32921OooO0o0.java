package oO0OO0Oo;

import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32953OooO0oO;

/* JADX INFO: renamed from: oO0OO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32921OooO0o0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends AbstractC32954OooO0oo.OooO0OO<M>, T> T OooO00o(AbstractC32954OooO0oo.OooO0OO<M> oooO0OO, AbstractC32954OooO0oo.C32956OooO0o0<M, T> extension) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        OooOOO0.OooO0oO(extension, "extension");
        if (oooO0OO.OooO0oO(extension)) {
            return (T) oooO0OO.OooO0o(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends AbstractC32954OooO0oo.OooO0OO<M>, T> T OooO0O0(AbstractC32954OooO0oo.OooO0OO<M> oooO0OO, AbstractC32954OooO0oo.C32956OooO0o0<M, List<T>> extension, int i) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        OooOOO0.OooO0oO(extension, "extension");
        oooO0OO.OooOO0(extension);
        C32953OooO0oO<AbstractC32954OooO0oo.C32955OooO0Oo> c32953OooO0oO = oooO0OO.f119084OooOo0o;
        c32953OooO0oO.getClass();
        AbstractC32954OooO0oo.C32955OooO0Oo c32955OooO0Oo = extension.f119093OooO0Oo;
        if (!c32955OooO0Oo.f119089OooOoO0) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objOooO0o0 = c32953OooO0oO.OooO0o0(c32955OooO0Oo);
        if (i >= (objOooO0o0 == null ? 0 : ((List) objOooO0o0).size())) {
            return null;
        }
        oooO0OO.OooOO0(extension);
        if (!c32955OooO0Oo.f119089OooOoO0) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objOooO0o02 = c32953OooO0oO.OooO0o0(c32955OooO0Oo);
        if (objOooO0o02 != null) {
            return (T) extension.OooO00o(((List) objOooO0o02).get(i));
        }
        throw new IndexOutOfBoundsException();
    }
}
