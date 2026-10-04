package com.huawei.stylus.penengine.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.penkit.impl.kitpaint.HwHandWritingImpl;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class HwHandWritingView extends FrameLayout {
    private static final String TAG = "HwHandWritingView";
    private IHwHandWritingView mHandWritingView;
    private View mPaintView;
    private View mToolBox;

    public HwHandWritingView(Context context) {
        this(context, null);
    }

    public boolean canRedo() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        if (iHwHandWritingView != null) {
            return iHwHandWritingView.canRedo();
        }
        return false;
    }

    public boolean canUndo() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        if (iHwHandWritingView != null) {
            return iHwHandWritingView.canUndo();
        }
        return false;
    }

    public void clear() {
        this.mHandWritingView.clear();
    }

    public Rect getContentRange() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        return iHwHandWritingView != null ? iHwHandWritingView.getContentRange() : new Rect();
    }

    public void getThumbnail(Bitmap bitmap, RectF rectF) {
        this.mHandWritingView.getThumbnail(bitmap, rectF);
    }

    public Rect getVisibleRange() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        return iHwHandWritingView != null ? iHwHandWritingView.getVisibleRange() : new Rect();
    }

    public boolean isChanged() {
        return this.mHandWritingView.isChanged();
    }

    public boolean isEmpty() {
        return this.mHandWritingView.isEmpty();
    }

    public void load() {
        this.mHandWritingView.load();
    }

    public void redo() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        if (iHwHandWritingView != null) {
            iHwHandWritingView.redo();
        }
    }

    public boolean save(String str) {
        return this.mHandWritingView.save(str);
    }

    public void setMaxPages(int i) {
        this.mHandWritingView.setMaxPages(i);
    }

    public void setPaintViewListener(IPaintViewListener iPaintViewListener) {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        if (iHwHandWritingView != null) {
            iHwHandWritingView.setPaintViewListener(iPaintViewListener);
        }
    }

    public void setSupportFinger(boolean z) {
        this.mHandWritingView.setSupportFinger(z);
    }

    public void setToolType(int i, int i2, int i3) {
        this.mHandWritingView.setToolType(i, i2, i3);
    }

    public void undo() {
        IHwHandWritingView iHwHandWritingView = this.mHandWritingView;
        if (iHwHandWritingView != null) {
            iHwHandWritingView.undo();
        }
    }

    public HwHandWritingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean load(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Log.e(TAG, "file not exist.");
            return false;
        }
        try {
            return this.mHandWritingView.load(file.getCanonicalPath());
        } catch (IOException unused) {
            Log.e(TAG, "load file, getCanonicalPath IOException.");
            return false;
        }
    }

    public HwHandWritingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.mHandWritingView == null) {
            HwHandWritingImpl hwHandWritingImpl = new HwHandWritingImpl(context);
            this.mHandWritingView = hwHandWritingImpl;
            this.mPaintView = hwHandWritingImpl.initView(attributeSet, i);
            this.mToolBox = this.mHandWritingView.initToolBox(attributeSet, i);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            addView(this.mPaintView, layoutParams);
            addView(this.mToolBox, layoutParams2);
            this.mHandWritingView.init();
        }
    }
}
