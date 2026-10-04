package com.orion.notein.richeditor.spans;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ImageSpan extends android.text.style.ImageSpan implements RTSpan {
    private static final int MAX_IMAGE_DIMENSION = 480;
    private final Uri mContentUri;
    private final Context mContext;
    private Drawable mDrawable;

    public ImageSpan(Context context, Uri uri) {
        super(context, uri);
        this.mDrawable = null;
        this.mContext = context;
        this.mContentUri = uri;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        if (obj instanceof Uri) {
            return new ImageSpan(this.mContext, (Uri) obj);
        }
        if (obj instanceof String) {
            return new ImageSpan(this.mContext, Uri.parse((String) obj));
        }
        return null;
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        InputStream inputStreamOpenInputStream;
        int i;
        BitmapDrawable bitmapDrawable;
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            return drawable;
        }
        BitmapDrawable bitmapDrawable2 = null;
        if (this.mContentUri != null) {
            try {
                inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(this.mContentUri);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                int width = bitmapDecodeStream.getWidth();
                int i2 = MAX_IMAGE_DIMENSION;
                if (width > MAX_IMAGE_DIMENSION || bitmapDecodeStream.getHeight() > MAX_IMAGE_DIMENSION) {
                    int width2 = bitmapDecodeStream.getWidth();
                    int height = bitmapDecodeStream.getHeight();
                    if (width2 > height) {
                        i = (int) (MAX_IMAGE_DIMENSION / (width2 / height));
                    } else {
                        i2 = (int) (MAX_IMAGE_DIMENSION / (height / width2));
                        i = MAX_IMAGE_DIMENSION;
                    }
                    bitmapDecodeStream = Bitmap.createScaledBitmap(bitmapDecodeStream, i2, i, true);
                }
                bitmapDrawable = new BitmapDrawable(this.mContext.getResources(), bitmapDecodeStream);
            } catch (Exception e) {
                e = e;
            }
            try {
                bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                inputStreamOpenInputStream.close();
                return bitmapDrawable;
            } catch (Exception e2) {
                e = e2;
                bitmapDrawable2 = bitmapDrawable;
                Log.e("ImageSpan", "Failed to loaded content " + this.mContentUri, e);
                return bitmapDrawable2;
            }
        }
        return bitmapDrawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        try {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        } catch (Exception e) {
            Log.e("ImageSpan", "Failed to get size", e);
            return 0;
        }
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Object getValue() {
        return getSource();
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new ImageSpan(this.mContext, Uri.parse(getSource()));
    }
}
