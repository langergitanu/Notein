package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class GradientStopCollection implements Iterable<GradientStop> {
    private zz7C zzYuv;
    private ArrayList<GradientStop> zzZ3m;
    private zzZ90 zzZxX;

    public GradientStopCollection(zz7C zz7c, zzZ90 zzz90) {
        com.aspose.words.internal.zzZ4.zzY((Object) zz7c, "ParentFill");
        this.zzYuv = zz7c;
        this.zzZxX = zzz90;
    }

    private ArrayList<GradientStop> zzZAA() {
        if (this.zzZ3m == null) {
            this.zzZ3m = new ArrayList<>(this.zzYuv.zzZAA().size());
            Iterator<zz7B> it = this.zzYuv.zzZAA().iterator();
            while (it.hasNext()) {
                this.zzZ3m.add(new GradientStop(it.next(), this.zzZxX, this));
            }
        }
        return this.zzZ3m;
    }

    public GradientStop add(GradientStop gradientStop) {
        return insert(getCount(), gradientStop);
    }

    public GradientStop get(int i) {
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("The specified value is out of range.\r\nParameter name: index");
        }
        GradientStop gradientStop = zzZAA().get(i);
        if (!com.aspose.words.internal.zzZKO.zzA(gradientStop.zzZ5e(), this.zzYuv.zzZAA().get(i))) {
            zzZAA().set(i, new GradientStop(this.zzYuv.zzZAA().get(i), this.zzZxX, this));
        }
        return gradientStop;
    }

    public int getCount() {
        return this.zzYuv.zzZAA().size();
    }

    public GradientStop insert(int i, GradientStop gradientStop) {
        com.aspose.words.internal.zzZ4.zzY((Object) gradientStop, "GradientStop");
        if (i < 0 || i > getCount()) {
            throw new IllegalArgumentException("The specified value is out of range.\r\nParameter name: index");
        }
        if (gradientStop.zzZ5f() != null) {
            throw new IllegalStateException("The gradient stop belongs to some collection already.");
        }
        zzZAA().add(i, gradientStop);
        gradientStop.zzZ(this);
        this.zzYuv.zzZAA().add(i, gradientStop.zzZ5e());
        return gradientStop;
    }

    @Override // java.lang.Iterable
    public Iterator<GradientStop> iterator() {
        return zzZAA().iterator();
    }

    public boolean remove(GradientStop gradientStop) {
        if (!zzZAA().remove(gradientStop)) {
            return false;
        }
        gradientStop.zzZ(null);
        return this.zzYuv.zzZAA().remove(gradientStop.zzZ5e());
    }

    public GradientStop removeAt(int i) {
        if (getCount() <= 2) {
            throw new IllegalStateException("There can not be less than two gradient stops in gradient fill.");
        }
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("The specified value is out of range.\r\nParameter name: index");
        }
        GradientStop gradientStop = zzZAA().get(i);
        gradientStop.zzZ(null);
        zzZAA().remove(i);
        this.zzYuv.zzZAA().remove(i);
        return gradientStop;
    }

    public void set(int i, GradientStop gradientStop) {
        com.aspose.words.internal.zzZ4.zzY((Object) gradientStop, "GradientStop");
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("The specified value is out of range.\r\nParameter name: index");
        }
        if (gradientStop.zzZ5f() == null) {
            zzZAA().set(i, gradientStop);
            gradientStop.zzZ(this);
            this.zzYuv.zzZAA().set(i, gradientStop.zzZ5e());
        } else {
            if (!com.aspose.words.internal.zzZKO.zzA(gradientStop.zzZ5f(), this)) {
                throw new IllegalStateException("The gradient stop belongs to another collection already.");
            }
            if (!com.aspose.words.internal.zzZKO.zzA(zzZAA().get(i), gradientStop)) {
                throw new IllegalStateException("The gradient stop is set to another index already.");
            }
        }
    }

    public final zz7C zzZ5c() {
        return this.zzYuv;
    }
}
