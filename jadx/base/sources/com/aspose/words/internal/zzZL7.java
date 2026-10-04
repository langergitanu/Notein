package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL7 {
    private List<String> zzZPS = new ArrayList();
    private boolean zzZPT;
    private boolean zzZPU;
    private boolean zzZPV;
    private boolean zzZPW;
    private boolean zzZPX;
    public int zzZPY;
    private int zzZPZ;
    private zzZLZ zzZQ0;
    private String zzZV0;

    public zzZL7(zzZLZ zzzlz) {
        this.zzZQ0 = zzzlz;
    }

    private void reset() {
        this.zzZPW = false;
        this.zzZPV = false;
        this.zzZPU = false;
        this.zzZPT = false;
        this.zzZPS.clear();
    }

    private boolean zzY(zzZL7 zzzl7) {
        String str;
        String str2;
        if (zzzl7.zzZPW) {
            return true;
        }
        if (this.zzZPU && zzzl7.zzZPU && (this.zzZV0.equals(zzzl7.zzZV0) || (str2 = zzzl7.zzZV0) == null || "".equals(str2))) {
            return true;
        }
        if (this.zzZPW) {
            return false;
        }
        if (zzzl7.zzZPU) {
            if ((this.zzZPT && zzzl7.zzZV0.equals(this.zzZV0)) || (this.zzZPV && ((str = zzzl7.zzZV0) == null || str.length() == 0))) {
                return false;
            }
            for (int i = 0; i < this.zzZPS.size(); i++) {
                if (this.zzZPS.get(i).equals(zzzl7.zzZV0)) {
                    return false;
                }
            }
        } else {
            if ((this.zzZPV && !zzzl7.zzZPV) || ((this.zzZPT && !zzzl7.zzZPT) || this.zzZPU)) {
                return false;
            }
            for (int i2 = 0; i2 < this.zzZPS.size(); i2++) {
                if (!zzzl7.zzZPS.contains(this.zzZPS.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void zzQq(int i) {
        this.zzZPZ = i;
    }

    public final boolean zzUe(String str) {
        if (this.zzZPW) {
            return true;
        }
        if (this.zzZPU && !str.equals(this.zzZV0)) {
            return true;
        }
        if (this.zzZPT && str.equals(this.zzZV0)) {
            return true;
        }
        if (this.zzZPV && "".equals(str)) {
            return true;
        }
        for (int i = 0; i < this.zzZPS.size(); i++) {
            if (str.equals(this.zzZPS.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void zzUf(String str) {
        if (this.zzZPX) {
            return;
        }
        reset();
        if (str == null) {
            str = "##any";
        }
        for (String str2 : zzZLF.zzUj(str)) {
            if ("##any".equals(str2)) {
                this.zzZPW = true;
            } else if ("##other".equals(str2)) {
                this.zzZPU = true;
            } else if ("##targetNamespace".equals(str2)) {
                this.zzZPT = true;
            } else if ("##local".equals(str2)) {
                this.zzZPV = true;
            } else if (zzZLF.zzUk(str2)) {
                if (this.zzZPS.contains(str2)) {
                    StringBuilder sb = new StringBuilder("Multiple specification of '");
                    sb.append(str2);
                    sb.append("' was found.");
                } else {
                    this.zzZPS.add(str2);
                }
            }
        }
    }

    public final void zzUg(String str) {
        this.zzZV0 = str;
    }

    public final void zzZ(zzZL7 zzzl7) {
        zzY(zzzl7);
    }

    public final void zzft() {
        this.zzZPW = true;
    }

    public final void zzfu() {
        this.zzZPX = true;
    }

    public final String zzgY() {
        return this.zzZV0;
    }
}
