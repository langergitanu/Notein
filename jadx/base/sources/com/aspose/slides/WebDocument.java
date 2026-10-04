package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class WebDocument {

    /* JADX INFO: renamed from: k4 */
    private final WebDocumentOptions f3694k4;

    /* JADX INFO: renamed from: kk */
    private final Output f3695kk;

    /* JADX INFO: renamed from: to */
    private final Storage f3696to;

    /* JADX INFO: renamed from: x1 */
    private final Input f3697x1;

    public WebDocument(WebDocumentOptions webDocumentOptions) {
        Storage storage = new Storage();
        this.f3696to = storage;
        if (webDocumentOptions == null) {
            throw new ArgumentNullException("options");
        }
        if (webDocumentOptions.getTemplateEngine() == null) {
            throw new ArgumentException("TemplateEngine should not be null", "options");
        }
        if (webDocumentOptions.getOutputSaver() == null) {
            throw new ArgumentException("OutputSaver should not be null", "options");
        }
        this.f3694k4 = webDocumentOptions;
        this.f3697x1 = new Input(webDocumentOptions.getTemplateEngine());
        this.f3695kk = new Output(webDocumentOptions.getTemplateEngine(), storage);
    }

    public final Storage getGlobal() {
        return this.f3696to;
    }

    public final Input getInput() {
        return this.f3697x1;
    }

    public final Output getOutput() {
        return this.f3695kk;
    }

    public final void save() {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f3695kk.m2104k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                this.f3694k4.getOutputSaver().save((String) keyValuePair.getKey(), (IOutputFile) keyValuePair.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
