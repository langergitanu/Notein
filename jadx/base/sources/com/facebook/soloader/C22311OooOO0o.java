package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC22322OooOoo0;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.facebook.soloader.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C22311OooOO0o extends AbstractC22322OooOoo0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f67497OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f67498OooO0o0;

    /* JADX INFO: renamed from: com.facebook.soloader.OooOO0o$OooO00o */
    public static final class OooO00o extends AbstractC22322OooOoo0.OooO0O0 implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f67499OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final ZipEntry f67500OooOoO0;

        public OooO00o(String str, ZipEntry zipEntry, int i) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f67500OooOoO0 = zipEntry;
            this.f67499OooOoO = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            return this.f67519OooOo0o.compareTo(oooO00o.f67519OooOo0o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && OooO00o.class == obj.getClass()) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f67500OooOoO0.equals(oooO00o.f67500OooOoO0) && this.f67499OooOoO == oooO00o.f67499OooOoO) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f67500OooOoO0.hashCode() + (this.f67499OooOoO * 31);
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.OooOO0o$OooO0O0 */
    public class OooO0O0 extends AbstractC22322OooOoo0.AbstractC22323OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ZipFile f67501OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO00o[] f67502OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C22307OooO0Oo f67503OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C22311OooOO0o f67504OooOoO0;

        public OooO0O0(C22307OooO0Oo c22307OooO0Oo, C22311OooOO0o c22311OooOO0o) throws IOException {
            this.f67503OooOoO = c22307OooO0Oo;
            this.f67501OooOo = new ZipFile(c22307OooO0Oo.f67498OooO0o0);
            this.f67504OooOoO0 = c22311OooOO0o;
        }

        @Override // com.facebook.soloader.AbstractC22322OooOoo0.AbstractC22323OooO0Oo
        public final AbstractC22322OooOoo0.OooO0O0[] OooO0OO() throws IOException {
            return OooOOoo();
        }

        @Override // com.facebook.soloader.AbstractC22322OooOoo0.AbstractC22323OooO0Oo
        public final void OooOOO0(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (OooO00o oooO00o : OooOOoo()) {
                InputStream inputStream = this.f67501OooOo.getInputStream(oooO00o.f67500OooOoO0);
                try {
                    AbstractC22322OooOoo0.OooO0OO oooO0OO = new AbstractC22322OooOoo0.OooO0OO(oooO00o, inputStream);
                    inputStream = null;
                    try {
                        AbstractC22322OooOoo0.AbstractC22323OooO0Oo.OooO00o(oooO0OO, bArr, file);
                        oooO0OO.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public final OooO00o[] OooOOo0() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(this.f67503OooOoO.f67497OooO0o);
            String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f67501OooOo.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    int i = 0;
                    while (true) {
                        if (i >= supportedAbis.length) {
                            i = -1;
                            break;
                        }
                        String str = supportedAbis[i];
                        if (str != null && strGroup.equals(str)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        linkedHashSet.add(strGroup);
                        OooO00o oooO00o = (OooO00o) map.get(strGroup2);
                        if (oooO00o == null || i < oooO00o.f67499OooOoO) {
                            map.put(strGroup2, new OooO00o(strGroup2, zipEntryNextElement, i));
                        }
                    }
                }
            }
            this.f67504OooOoO0.getClass();
            OooO00o[] oooO00oArr = (OooO00o[]) map.values().toArray(new OooO00o[map.size()]);
            Arrays.sort(oooO00oArr);
            return oooO00oArr;
        }

        public OooO00o[] OooOOoo() {
            throw null;
        }

        @Override // com.facebook.soloader.AbstractC22322OooOoo0.AbstractC22323OooO0Oo, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f67501OooOo.close();
        }
    }

    public C22311OooOO0o(Context context, File file, String str) {
        super(context, str);
        this.f67498OooO0o0 = file;
        this.f67497OooO0o = "^lib/([^/]+)/([^/]+\\.so)$";
    }
}
