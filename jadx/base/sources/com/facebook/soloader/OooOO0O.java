package com.facebook.soloader;

import com.facebook.soloader.AbstractC22322OooOoo0;
import com.facebook.soloader.SysUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O extends AbstractC22322OooOoo0 {

    public final class OooO00o extends AbstractC22322OooOoo0.AbstractC22323OooO0Oo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0[] f67495OooOo0o;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OooO00o(OooOO0O oooOO0O, OooOO0O oooOO0O2) throws IOException {
            BufferedReader bufferedReader;
            File file = new File("/data/local/tmp/exopackage/" + oooOO0O.f67513OooO0Oo.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
            int length = supportedAbis.length;
            int i = 0;
            int i2 = 0;
            loop0: while (i2 < length) {
                String str = supportedAbis[i2];
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    linkedHashSet.add(str);
                    File file3 = new File(file2, "metadata.txt");
                    if (file3.isFile()) {
                        FileReader fileReader = new FileReader(file3);
                        try {
                            bufferedReader = new BufferedReader(fileReader);
                        } finally {
                        }
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        break loop0;
                                    }
                                    String str2 = line.substring(i, iIndexOf) + ".so";
                                    int size = arrayList.size();
                                    int i3 = i;
                                    while (true) {
                                        if (i3 >= size) {
                                            String strSubstring = line.substring(iIndexOf + 1);
                                            arrayList.add(new OooO0O0(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file2, strSubstring)));
                                            break;
                                        } else if (((OooO0O0) arrayList.get(i3)).f67519OooOo0o.equals(str2)) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    i = 0;
                                }
                            } finally {
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
                i = 0;
            }
            this.f67495OooOo0o = (OooO0O0[]) arrayList.toArray(new OooO0O0[arrayList.size()]);
        }

        @Override // com.facebook.soloader.AbstractC22322OooOoo0.AbstractC22323OooO0Oo
        public final AbstractC22322OooOoo0.OooO0O0[] OooO0OO() throws IOException {
            return this.f67495OooOo0o;
        }

        @Override // com.facebook.soloader.AbstractC22322OooOoo0.AbstractC22323OooO0Oo
        public final void OooOOO0(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (OooO0O0 oooO0O0 : this.f67495OooOo0o) {
                FileInputStream fileInputStream = new FileInputStream(oooO0O0.f67496OooOoO0);
                try {
                    AbstractC22322OooOoo0.OooO0OO oooO0OO = new AbstractC22322OooOoo0.OooO0OO(oooO0O0, fileInputStream);
                    fileInputStream = null;
                    try {
                        AbstractC22322OooOoo0.AbstractC22323OooO0Oo.OooO00o(oooO0OO, bArr, file);
                        oooO0OO.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    public static final class OooO0O0 extends AbstractC22322OooOoo0.OooO0O0 {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final File f67496OooOoO0;

        public OooO0O0(String str, String str2, File file) {
            super(str, str2);
            this.f67496OooOoO0 = file;
        }
    }

    @Override // com.facebook.soloader.OooO0o, com.facebook.soloader.AbstractC22320OooOoO0
    public final String OooO0OO() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.AbstractC22322OooOoo0
    public final AbstractC22322OooOoo0.AbstractC22323OooO0Oo OooO0oo(boolean z) throws IOException {
        return new OooO00o(this, this);
    }
}
