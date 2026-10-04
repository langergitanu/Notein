package com.orion.notein.richeditor.fonts;

import android.content.res.AssetManager;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes9.dex */
abstract class TTFAnalyzer {
    public static String getFontName(String str) throws Throwable {
        TTFRandomAccessFile tTFRandomAccessFile;
        TTFRandomAccessFile tTFRandomAccessFile2 = null;
        try {
            tTFRandomAccessFile = new TTFRandomAccessFile(new RandomAccessFile(str, "r"));
        } catch (IOException unused) {
            tTFRandomAccessFile = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String tTFFontName = getTTFFontName(tTFRandomAccessFile, str);
            IOUtils.closeQuietly(tTFRandomAccessFile);
            return tTFFontName;
        } catch (IOException unused2) {
            IOUtils.closeQuietly(tTFRandomAccessFile);
            return null;
        } catch (Throwable th2) {
            th = th2;
            tTFRandomAccessFile2 = tTFRandomAccessFile;
            IOUtils.closeQuietly(tTFRandomAccessFile2);
            throw th;
        }
    }

    private static String getTTFFontName(TTFInputStream tTFInputStream, String str) {
        try {
            int dword = readDword(tTFInputStream);
            if (dword != 1953658213 && dword != 65536 && dword != 1330926671) {
                return null;
            }
            int word = readWord(tTFInputStream);
            readWord(tTFInputStream);
            readWord(tTFInputStream);
            readWord(tTFInputStream);
            for (int i = 0; i < word; i++) {
                int dword2 = readDword(tTFInputStream);
                readDword(tTFInputStream);
                int dword3 = readDword(tTFInputStream);
                int dword4 = readDword(tTFInputStream);
                if (dword2 == 1851878757) {
                    byte[] bArr = new byte[dword4];
                    tTFInputStream.seek(dword3);
                    read(tTFInputStream, bArr);
                    int word2 = getWord(bArr, 2);
                    int word3 = getWord(bArr, 4);
                    for (int i2 = 0; i2 < word2; i2++) {
                        int i3 = i2 * 12;
                        int word4 = getWord(bArr, i3 + 6);
                        if (getWord(bArr, i3 + 12) == 4 && word4 == 1) {
                            int word5 = getWord(bArr, i3 + 14);
                            int word6 = getWord(bArr, i3 + 16) + word3;
                            if (word6 >= 0 && word6 + word5 < dword4) {
                                return new String(bArr, word6, word5);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException | IOException unused) {
        }
        return null;
    }

    private static int getWord(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    private static void read(TTFInputStream tTFInputStream, byte[] bArr) throws IOException {
        if (tTFInputStream.read(bArr) != bArr.length) {
            throw new IOException();
        }
    }

    private static int readByte(TTFInputStream tTFInputStream) throws IOException {
        return tTFInputStream.read() & 255;
    }

    private static int readDword(TTFInputStream tTFInputStream) throws IOException {
        return readByte(tTFInputStream) | (readByte(tTFInputStream) << 24) | (readByte(tTFInputStream) << 16) | (readByte(tTFInputStream) << 8);
    }

    private static int readWord(TTFInputStream tTFInputStream) throws IOException {
        return readByte(tTFInputStream) | (readByte(tTFInputStream) << 8);
    }

    public static String getFontName(AssetManager assetManager, String str) throws Throwable {
        TTFAssetInputStream tTFAssetInputStream;
        TTFAssetInputStream tTFAssetInputStream2 = null;
        try {
            tTFAssetInputStream = new TTFAssetInputStream(assetManager.open(str, 1));
            try {
                String tTFFontName = getTTFFontName(tTFAssetInputStream, str);
                IOUtils.closeQuietly(tTFAssetInputStream);
                return tTFFontName;
            } catch (FileNotFoundException unused) {
                IOUtils.closeQuietly(tTFAssetInputStream);
                return null;
            } catch (IOException unused2) {
                IOUtils.closeQuietly(tTFAssetInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                tTFAssetInputStream2 = tTFAssetInputStream;
                IOUtils.closeQuietly(tTFAssetInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            tTFAssetInputStream = null;
        } catch (IOException unused4) {
            tTFAssetInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
