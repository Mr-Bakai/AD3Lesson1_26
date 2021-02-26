package com.hfad.ad3lesson1_26.ui;

import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.hfad.ad3lesson1_26.R;
import com.hfad.ad3lesson1_26.data.Card;
import com.hfad.ad3lesson1_26.data.Game;

import java.util.List;

public class EmojiGame {

    private final Game<String> game;

    @RequiresApi(api = Build.VERSION_CODES.R)

    public EmojiGame() {
        List<String> content = List.of("❤️", "🎃", "👹", "😎", "👽");
        game = new Game<>(content);
    }

    public void choose(Card<String> card){
        game.choose(card);
    }

    public List<Card<String>> getCards(){
        return game.getCard();
    }
}
