package com.miui.penengine.ocr;

import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiInk {
    private final List<List<PointF>> strokes;

    public static class Builder {
        private final List<List<PointF>> strokes = new LinkedList();

        public Builder addStroke(Stroke stroke) {
            this.strokes.add(stroke.m80458b());
            return this;
        }

        public MiuiInk build() {
            return new MiuiInk(new ArrayList(this.strokes));
        }
    }

    public static class Stroke {

        /* JADX INFO: renamed from: a */
        public final List<PointF> f57379a;

        public static class Builder {
            private final List<PointF> points = new LinkedList();

            public Builder addPoint(MotionEvent motionEvent) {
                this.points.add(new PointF(motionEvent.getX(), motionEvent.getY()));
                return this;
            }

            public Stroke build() {
                return new Stroke(new ArrayList(this.points));
            }
        }

        public Stroke(List<PointF> list) {
            this.f57379a = list;
        }

        /* JADX INFO: renamed from: a */
        public static Builder m80457a() {
            return new Builder();
        }

        /* JADX INFO: renamed from: b */
        public List<PointF> m80458b() {
            return this.f57379a;
        }
    }

    private MiuiInk(List<List<PointF>> list) {
        this.strokes = list;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<List<PointF>> getStrokes() {
        return this.strokes;
    }

    public int getStrokesCount() {
        return this.strokes.size();
    }
}
