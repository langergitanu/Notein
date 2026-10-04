package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ap */
/* JADX INFO: loaded from: classes7.dex */
final class C16376ap extends AbstractC16374an {

    /* JADX INFO: renamed from: a */
    private final AbstractC16378ar f51558a;

    public C16376ap(AbstractC16378ar abstractC16378ar, int i) {
        super(abstractC16378ar.size(), i);
        this.f51558a = abstractC16378ar;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16374an
    /* JADX INFO: renamed from: a */
    public final Object mo75026a(int i) {
        return this.f51558a.get(i);
    }
}
