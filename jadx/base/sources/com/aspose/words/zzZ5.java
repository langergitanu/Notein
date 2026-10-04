package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5 {
    private int zz8r;
    private String zzZDZ;
    private String zzZE0;
    private int zzZE1;
    private String zzZE2;
    private int zzZE8;
    private int zzZEj;
    private int zzZEl;
    private ArrayList<String> zzZE4 = new ArrayList<>();
    private ArrayList<String> zzZE3 = new ArrayList<>();

    public zzZ5(String str, int i, String str2, String str3, int i2, int i3) {
        this.zzZE2 = str;
        this.zz8r = i;
        this.zzZE0 = str2;
        this.zzZDZ = str3;
        this.zzZE8 = i2;
        this.zzZEj = i3;
    }

    public final int getByteCount() {
        return this.zz8r;
    }

    public final int getStartPosition() {
        return this.zzZEl;
    }

    public final void setStartPosition(int i) {
        this.zzZEl = i;
    }

    public final void zzP4(int i) {
        this.zzZEj = i;
    }

    public final void zzP5(int i) {
        this.zzZE1 = i;
    }

    public final void zzTw(String str) {
        this.zzZE2 = str;
    }

    public final void zzZ(zzZ5 zzz5) {
        this.zzZE2 += zzz5.zzZE2;
        this.zz8r += zzz5.zz8r;
        this.zzZE3 = zzz5.zzZE3;
    }

    public final int zzaL() {
        return this.zzZE1;
    }

    public final int zzaN() {
        return this.zzZEj;
    }

    public final int zzat() {
        return this.zzZE8;
    }

    public final String zzau() {
        return this.zzZE2;
    }

    public final String zzav() {
        return com.aspose.words.internal.zzZKN.format("{0}-//*[@aid='{1}']", this.zzZE0, this.zzZDZ);
    }

    public final ArrayList<String> zzaw() {
        return this.zzZE3;
    }

    public final ArrayList<String> zzax() {
        return this.zzZE4;
    }
}
