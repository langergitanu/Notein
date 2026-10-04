package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import oO00o0O.C32336OooO0Oo;
import oO00o0OO.CallableC32345OooO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
public class ProtoStorageClient {
    private final Application application;
    private final String fileName;

    public ProtoStorageClient(Application application, String str) {
        this.application = application;
        this.fileName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractMessageLite lambda$read$1(Parser parser) throws Exception {
        synchronized (this) {
            try {
                FileInputStream fileInputStreamOpenFileInput = this.application.openFileInput(this.fileName);
                try {
                    AbstractMessageLite abstractMessageLite = (AbstractMessageLite) parser.parseFrom(fileInputStreamOpenFileInput);
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return abstractMessageLite;
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException | FileNotFoundException e) {
                Logging.logi("Recoverable exception while reading cache: " + e.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$write$0(AbstractMessageLite abstractMessageLite) throws Exception {
        synchronized (this) {
            FileOutputStream fileOutputStreamOpenFileOutput = this.application.openFileOutput(this.fileName, 0);
            try {
                fileOutputStreamOpenFileOutput.write(abstractMessageLite.toByteArray());
                fileOutputStreamOpenFileOutput.close();
            } finally {
            }
        }
        return abstractMessageLite;
    }

    public <T extends AbstractMessageLite> AbstractC33485OooO<T> read(final Parser<T> parser) {
        return new CallableC32345OooO(new Callable() { // from class: com.google.firebase.inappmessaging.internal.OoooO0O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68550OooOo0o.lambda$read$1(parser);
            }
        });
    }

    public AbstractC33487OooO0O0 write(AbstractMessageLite abstractMessageLite) {
        return new C32336OooO0Oo(new CallableC22755OoooO0(this, abstractMessageLite));
    }
}
