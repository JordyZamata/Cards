package com.examen.cards.data;

import com.examen.cards.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CardResponse {
    private List<Card> cards;

}
