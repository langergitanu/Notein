package com.orion.notein.richeditor.effects;

import com.orion.notein.richeditor.RTEditText;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Effects {
    public static final AlignmentEffect ALIGNMENT;
    public static final ArrayList<Effect> ALL_EFFECTS;
    public static final BackgroundColorEffect BACKGROUND_COLOR;
    public static final BoldEffect BOLD;
    public static final BulletEffect BULLET;
    public static final DividerEffect DIVIDER;
    public static final AbsoluteSizeEffect FONT_SIZE;
    public static final ForegroundColorEffect FOREGROUND_COLOR;
    public static final ArrayList<Effect> FORMATTING_EFFECTS;
    public static final HeadingEffect HEADING;
    public static final IndentationEffect INDENTATION;
    public static final ItalicEffect ITALIC;
    public static final LinkEffect LINK;
    public static final NumberEffect NUMBER;
    public static final StrikethroughEffect STRIKETHROUGH;
    public static final SubscriptEffect SUBSCRIPT;
    public static final SuperscriptEffect SUPERSCRIPT;
    public static final TypefaceEffect TYPEFACE;
    public static final UnderlineEffect UNDERLINE;

    static {
        BoldEffect boldEffect = new BoldEffect();
        BOLD = boldEffect;
        ItalicEffect italicEffect = new ItalicEffect();
        ITALIC = italicEffect;
        UnderlineEffect underlineEffect = new UnderlineEffect();
        UNDERLINE = underlineEffect;
        StrikethroughEffect strikethroughEffect = new StrikethroughEffect();
        STRIKETHROUGH = strikethroughEffect;
        SuperscriptEffect superscriptEffect = new SuperscriptEffect();
        SUPERSCRIPT = superscriptEffect;
        SubscriptEffect subscriptEffect = new SubscriptEffect();
        SUBSCRIPT = subscriptEffect;
        AbsoluteSizeEffect absoluteSizeEffect = new AbsoluteSizeEffect();
        FONT_SIZE = absoluteSizeEffect;
        ForegroundColorEffect foregroundColorEffect = new ForegroundColorEffect();
        FOREGROUND_COLOR = foregroundColorEffect;
        BackgroundColorEffect backgroundColorEffect = new BackgroundColorEffect();
        BACKGROUND_COLOR = backgroundColorEffect;
        TypefaceEffect typefaceEffect = new TypefaceEffect();
        TYPEFACE = typefaceEffect;
        LinkEffect linkEffect = new LinkEffect();
        LINK = linkEffect;
        BulletEffect bulletEffect = new BulletEffect();
        BULLET = bulletEffect;
        NumberEffect numberEffect = new NumberEffect();
        NUMBER = numberEffect;
        IndentationEffect indentationEffect = new IndentationEffect();
        INDENTATION = indentationEffect;
        AlignmentEffect alignmentEffect = new AlignmentEffect();
        ALIGNMENT = alignmentEffect;
        HeadingEffect headingEffect = new HeadingEffect();
        HEADING = headingEffect;
        DIVIDER = new DividerEffect();
        ArrayList<Effect> arrayList = new ArrayList<>();
        ALL_EFFECTS = arrayList;
        arrayList.add(boldEffect);
        arrayList.add(italicEffect);
        arrayList.add(underlineEffect);
        arrayList.add(strikethroughEffect);
        arrayList.add(superscriptEffect);
        arrayList.add(subscriptEffect);
        arrayList.add(absoluteSizeEffect);
        arrayList.add(foregroundColorEffect);
        arrayList.add(backgroundColorEffect);
        arrayList.add(typefaceEffect);
        arrayList.add(linkEffect);
        bulletEffect.addConflictEffect(numberEffect);
        arrayList.add(bulletEffect);
        numberEffect.addConflictEffect(bulletEffect);
        arrayList.add(numberEffect);
        arrayList.add(indentationEffect);
        arrayList.add(alignmentEffect);
        arrayList.add(headingEffect);
        ArrayList<Effect> arrayList2 = new ArrayList<>();
        FORMATTING_EFFECTS = arrayList2;
        arrayList2.add(boldEffect);
        arrayList2.add(italicEffect);
        arrayList2.add(underlineEffect);
        arrayList2.add(strikethroughEffect);
        arrayList2.add(superscriptEffect);
        arrayList2.add(subscriptEffect);
        arrayList2.add(absoluteSizeEffect);
        arrayList2.add(foregroundColorEffect);
        arrayList2.add(backgroundColorEffect);
        arrayList2.add(typefaceEffect);
        arrayList2.add(linkEffect);
        arrayList2.add(bulletEffect);
        arrayList2.add(numberEffect);
        arrayList2.add(indentationEffect);
        arrayList2.add(alignmentEffect);
        arrayList2.add(headingEffect);
    }

    public static void cleanupParagraphs(RTEditText rTEditText, Effect... effectArr) {
        cleanupParagraphs(rTEditText, DIVIDER, effectArr);
        cleanupParagraphs(rTEditText, ALIGNMENT, effectArr);
        cleanupParagraphs(rTEditText, BULLET, effectArr);
        cleanupParagraphs(rTEditText, NUMBER, effectArr);
        cleanupParagraphs(rTEditText, HEADING, effectArr);
    }

    private static void cleanupParagraphs(RTEditText rTEditText, ParagraphEffect paragraphEffect, Effect... effectArr) {
        for (Effect effect : effectArr) {
            if (paragraphEffect == effect) {
                return;
            }
        }
        paragraphEffect.onParagraphLayoutChanged(rTEditText);
    }
}
