package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.a */
/* JADX INFO: loaded from: classes7.dex */
final class C16281a extends AbstractC16297ap {

    /* JADX INFO: renamed from: a */
    private String f51402a;

    /* JADX INFO: renamed from: b */
    private AbstractC16355y f51403b;

    @Override // com.google.android.play.core.integrity.AbstractC16297ap
    /* JADX INFO: renamed from: a */
    public final AbstractC16297ap mo74930a(AbstractC16355y abstractC16355y) {
        this.f51403b = abstractC16355y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16297ap
    /* JADX INFO: renamed from: b */
    public final AbstractC16297ap mo74931b(String str) {
        this.f51402a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16297ap
    /* JADX INFO: renamed from: c */
    public final C16298aq mo74932c() {
        AbstractC16355y abstractC16355y;
        String str = this.f51402a;
        if (str != null && (abstractC16355y = this.f51403b) != null) {
            return new C16298aq(str, abstractC16355y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51402a == null) {
            sb.append(" token");
        }
        if (this.f51403b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
