package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class TemplateContext<TObject> {

    /* JADX INFO: renamed from: k4 */
    private final TObject f3502k4;

    /* JADX INFO: renamed from: kk */
    private final Storage f3503kk;

    /* JADX INFO: renamed from: to */
    private final Storage f3504to = new Storage();

    /* JADX INFO: renamed from: x1 */
    private final Output f3505x1;

    public TemplateContext(TObject tobject, Output output, Storage storage) {
        this.f3502k4 = tobject;
        this.f3505x1 = output;
        this.f3503kk = storage;
    }

    public final Storage getGlobal() {
        return this.f3503kk;
    }

    public final Storage getLocal() {
        return this.f3504to;
    }

    public final TObject getObject() {
        return this.f3502k4;
    }

    public final Output getOutput() {
        return this.f3505x1;
    }

    public final <TSubModel> TemplateContext<TSubModel> subModel(TSubModel tsubmodel) {
        return new TemplateContext<>(tsubmodel, this.f3505x1, this.f3503kk);
    }
}
