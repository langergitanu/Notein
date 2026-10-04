package com.huawei.hms.feature.dynamic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleCopy {

    /* JADX INFO: renamed from: a */
    public static final String f53549a = "ModuleCopy";

    /* JADX INFO: renamed from: b */
    public static final int f53550b = 2048;

    /* JADX INFO: renamed from: c */
    public static final int f53551c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f53552d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f53553e = "module_uri_path";

    /* JADX INFO: renamed from: f */
    public static final String f53554f = "loader_uri_path";

    /* JADX INFO: renamed from: g */
    public static final String f53555g = "dynamic_modules";

    /* JADX INFO: renamed from: h */
    public static final String f53556h = ".apk";

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.ModuleCopy$a */
    public static class RunnableC17906a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f53557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f53558b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f53559c;

        public RunnableC17906a(String[] strArr, int i, String str) {
            this.f53557a = strArr;
            this.f53558b = i;
            this.f53559c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.f53557a) {
                if (Integer.parseInt(str) < this.f53558b) {
                    Logger.m75880i(ModuleCopy.f53549a, "Delete low version:" + this.f53558b + " in modulePath.");
                    ModuleCopy.m76946b(this.f53559c + File.separator + str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m76939a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            Logger.m75880i(f53549a, "No version dirs in module path, need mkdir.");
            return 0;
        }
        int i = 0;
        for (String str : strArr) {
            if (Integer.parseInt(str) > i) {
                i = Integer.parseInt(str);
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m76946b(String str) {
        boolean z;
        File file = new File(str);
        if (file.isDirectory()) {
            z = true;
            for (String str2 : file.list()) {
                if (z) {
                    StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
                    sbOooO0OO.append(File.separator);
                    sbOooO0OO.append(str2);
                    z = m76946b(sbOooO0OO.toString());
                }
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m76947c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Exception e) {
            Log.e(f53549a, "makeDirectory Exception: " + e.getMessage());
            return false;
        }
    }

    public static void clearLowVersionModule(int i, String str, String[] strArr, String str2) {
        C17910c.m76948a(1, str2).execute(new RunnableC17906a(strArr, i, str));
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.m75877e(f53549a, "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static void copyModule(Context context, Bundle bundle) throws Throwable {
        if (context == null || bundle == null) {
            Logger.m75877e(f53549a, "The context or module info bundle is null.");
            return;
        }
        boolean zM76944a = m76944a(bundle);
        m76943a(context, bundle, 0);
        if (zM76944a) {
            bundle.putString(InterfaceC17909b.f53592r, bundle.getString(InterfaceC17909b.f53588n));
        } else {
            m76943a(context, bundle, 1);
        }
    }

    public static String getProtectedPath(Context context) {
        return context.createDeviceProtectedStorageContext().getDataDir().getAbsolutePath();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: a */
    public static java.lang.String m76940a(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: a */
    public static String m76941a(Context context, String str, Uri uri, String str2) throws Throwable {
        if (m76947c(str)) {
            m76942a(context, uri, str2);
            return str2;
        }
        Logger.m75877e(f53549a, "makeDirectory return false");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: a */
    public static void m76942a(Context context, Uri uri, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        IOException e;
        FileNotFoundException e2;
        ?? r4;
        StringBuilder sb;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                th = th;
                r4 = context;
            }
            try {
                if (inputStreamOpenInputStream == null) {
                    Logger.m75884w(f53549a, "Get input stream failed: null.");
                    closeQuietly(inputStreamOpenInputStream);
                    closeQuietly(null);
                    return;
                }
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str)));
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            closeQuietly(inputStreamOpenInputStream);
                            closeQuietly(bufferedOutputStream2);
                            return;
                        }
                        bufferedOutputStream2.write(bArr, 0, i);
                    }
                } catch (FileNotFoundException e3) {
                    bufferedOutputStream = bufferedOutputStream2;
                    e2 = e3;
                    sb = new StringBuilder();
                    sb.append("FileNotFoundException:");
                    sb.append(e2.getMessage());
                    context = inputStreamOpenInputStream;
                    Logger.m75877e(f53549a, sb.toString());
                    closeQuietly(context);
                    closeQuietly(bufferedOutputStream);
                } catch (IOException e4) {
                    bufferedOutputStream = bufferedOutputStream2;
                    e = e4;
                    sb = new StringBuilder();
                    sb.append("IOException ");
                    sb.append(e.getMessage());
                    context = inputStreamOpenInputStream;
                    Logger.m75877e(f53549a, sb.toString());
                    closeQuietly(context);
                    closeQuietly(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    r4 = inputStreamOpenInputStream;
                    closeQuietly(r4);
                    closeQuietly(bufferedOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                e2 = e5;
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                r4 = inputStreamOpenInputStream;
                closeQuietly(r4);
                closeQuietly(bufferedOutputStream);
                throw th;
            }
        } catch (FileNotFoundException e7) {
            e2 = e7;
            inputStreamOpenInputStream = null;
        } catch (IOException e8) {
            e = e8;
            inputStreamOpenInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76943a(Context context, Bundle bundle, int i) throws Throwable {
        String string = bundle.getString(i == 0 ? f53553e : f53554f);
        Logger.m75880i(f53549a, "path:" + string);
        String strM76940a = m76940a(context, bundle, i, Uri.parse(string));
        if (TextUtils.isEmpty(strM76940a)) {
            Logger.m75884w(f53549a, "checkModulePath failed: null.");
        } else if (i == 0) {
            bundle.putString(InterfaceC17909b.f53588n, strM76940a);
        } else {
            bundle.putString(InterfaceC17909b.f53592r, strM76940a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76944a(Bundle bundle) {
        return TextUtils.equals(bundle.getString(InterfaceC17909b.f53588n), bundle.getString(InterfaceC17909b.f53592r));
    }
}
