package ooooOOo0;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: ooooOOo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35243OooOooO implements InterfaceC35241OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C35243OooOooO f126595OooO00o = new C35243OooOooO();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC35241OooOoo.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof InterfaceC35241OooOoo;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + InterfaceC35241OooOoo.class.getName() + "()";
    }
}
