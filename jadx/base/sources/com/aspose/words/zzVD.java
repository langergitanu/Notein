package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzVD {
    private int mLength;
    private ArrayList<String> zzZw0 = new ArrayList<>();
    private int zzZw1;
    private int zzZw2;

    public zzVD(String str) {
        int length = str.length() / 1000;
        int i = length * 1000;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 1000;
            com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, str.substring(i3, i3 + 1000));
        }
        if (str.length() - i > 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, str.substring(i, (str.length() - i) + i));
        }
        this.mLength = str.length();
        invalidate();
    }

    private void invalidate() {
        this.zzZw2 = 0;
        this.zzZw1 = 0;
    }

    public final char get(int i) {
        int i2;
        int length = this.zzZw1;
        if (length <= i) {
            i2 = this.zzZw2;
            i -= length;
        } else {
            length = 0;
            i2 = 0;
        }
        while (i2 < this.zzZw0.size()) {
            String str = this.zzZw0.get(i2);
            if (i < str.length()) {
                this.zzZw2 = i2;
                this.zzZw1 = length;
                return str.charAt(i);
            }
            i -= str.length();
            length += str.length();
            i2++;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int getLength() {
        return this.mLength;
    }

    public final void insert(int i, String str) {
        for (int i2 = 0; i2 < this.zzZw0.size(); i2++) {
            if (i <= this.zzZw0.get(i2).length()) {
                ArrayList<String> arrayList = this.zzZw0;
                arrayList.set(i2, com.aspose.words.internal.zzZKN.zzV(arrayList.get(i2), i, str));
                this.mLength = str.length() + this.mLength;
                invalidate();
                return;
            }
            i -= this.zzZw0.get(i2).length();
        }
        throw new IndexOutOfBoundsException();
    }

    public final String substring(int i, int i2) {
        int i3;
        if (i2 == 0) {
            return "";
        }
        int length = this.zzZw1;
        if (length <= i) {
            i3 = this.zzZw2;
            i -= length;
        } else {
            length = 0;
            i3 = 0;
        }
        while (i3 < this.zzZw0.size()) {
            if (i < this.zzZw0.get(i3).length()) {
                this.zzZw2 = i3;
                this.zzZw1 = length;
                StringBuilder sb = new StringBuilder(i2);
                while (i2 > 0) {
                    String strSubstring = this.zzZw0.get(i3).substring(i, Math.min(i2, this.zzZw0.get(i3).length() - i) + i);
                    com.aspose.words.internal.zzZNH.zzU(sb, strSubstring);
                    i2 -= strSubstring.length();
                    i3++;
                    i = 0;
                }
                return sb.toString();
            }
            i -= this.zzZw0.get(i3).length();
            length += this.zzZw0.get(i3).length();
            i3++;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String zz0T() {
        StringBuilder sb = new StringBuilder(this.mLength);
        Iterator<String> it = this.zzZw0.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next());
        }
        return sb.toString();
    }
}
