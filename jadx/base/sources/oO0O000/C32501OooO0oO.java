package oO0O000;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o00o00oo.C25298OooO0o;
import oO00ooO.C32460OooOooO;
import oO0O000.C32500OooO0o0;
import oO0O000.C32500OooO0o0.OooO0O0;
import oO0o0O0O.C33562OooO00o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO0O000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32501OooO0oO extends o00000O.OooO0O0 {
    public static void OooO(File file, String str) throws IOException {
        Charset charset = C33580OooO00o.f121231OooO0O0;
        OooOOO0.OooO0oO(file, "<this>");
        OooOOO0.OooO0oO(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            OooOO0(fileOutputStream, str, charset);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void OooO0OO(File file, File target) throws IOException {
        OooOOO0.OooO0oO(target, "target");
        if (!file.exists()) {
            throw new OooO(file, null, "The source file doesn't exist.");
        }
        if (target.exists() && !target.delete()) {
            throw new OooO0OO(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new C32499OooO0Oo(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                C25298OooO0o.OooO00o(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean OooO0Oo(File file) {
        OooOOO0.OooO0oO(file, "<this>");
        OooO0o oooO0o = OooO0o.f116777OooOo0o;
        C32500OooO0o0.OooO0O0 oooO0O0 = new C32500OooO0o0(file).new OooO0O0();
        while (true) {
            boolean z = true;
            while (oooO0O0.hasNext()) {
                File next = oooO0O0.next();
                if (!next.delete() && next.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static String OooO0o(File file) {
        OooOOO0.OooO0oO(file, "<this>");
        String name = file.getName();
        OooOOO0.OooO0o(name, "getName(...)");
        return C33599OooOo0O.OooooOO(name, ".", name);
    }

    public static String OooO0o0(File file) {
        OooOOO0.OooO0oO(file, "<this>");
        String name = file.getName();
        OooOOO0.OooO0o(name, "getName(...)");
        return C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, name, "");
    }

    public static ArrayList OooO0oO(File file) throws IOException {
        Charset charset = C33580OooO00o.f121231OooO0O0;
        OooOOO0.OooO0oO(charset, "charset");
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            for (String it : (C33562OooO00o) C33574OooOOO0.OooO0oO(new C32502OooO0oo(bufferedReader))) {
                OooOOO0.OooO0oO(it, "it");
                arrayList.add(it);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static String OooO0oo(File file) throws IOException {
        Charset charset = C33580OooO00o.f121231OooO0O0;
        OooOOO0.OooO0oO(file, "<this>");
        OooOOO0.OooO0oO(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strOooO00o = o00000O.OooOO0.OooO00o(inputStreamReader);
            inputStreamReader.close();
            return strOooO00o;
        } finally {
        }
    }

    public static final void OooOO0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            OooOOO0.OooO0o(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        OooOOO0.OooO0Oo(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        OooOOO0.OooO0o(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            OooOOO0.OooO0o(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
