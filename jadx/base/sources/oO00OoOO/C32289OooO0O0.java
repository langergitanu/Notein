package oO00OoOO;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO00OoO0.C32286OooO0oO;

/* JADX INFO: renamed from: oO00OoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32289OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f116173OooO00o = Logger.getLogger(C32289OooO0O0.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List OooO00o(InputStream inputStream) throws Throwable {
        Throwable th;
        IOException e;
        Logger logger = f116173OooO00o;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    ArrayList arrayList = new ArrayList();
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        C32286OooO0oO c32286OooO0oO = new C32286OooO0oO();
                        c32286OooO0oO.readExternal(objectInputStream);
                        arrayList.add(c32286OooO0oO);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    try {
                        objectInputStream.close();
                        return arrayList;
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e2);
                        return arrayList;
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IllegalStateException("Unable to parse metadata file", e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 == 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e4);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e5);
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            if (0 == 0) {
            }
            throw th;
        }
    }
}
