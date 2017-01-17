package mx.neuland.richmond;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by user on 2/27/16.
 */
public class MyExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<ParentRow> parentRowList;
    private ArrayList<ParentRow> originalList;

    List<Serie> ListaSeries = new ArrayList<Serie>();

    String autor;

    public MyExpandableListAdapter(Context context
            , ArrayList<ParentRow> originalList) {
        this.context = context;
        this.parentRowList = new ArrayList<>();
        this.parentRowList.addAll(originalList);
        this.originalList = new ArrayList<>();
        this.originalList.addAll(originalList);

        ListaSeries.add(new Serie("CUBBY HOUSE By Fanny Riva Palacio - Stefania Villareal", "Fanny Riva Palacio - Stefania Villareal"));
        ListaSeries.add(new Serie("PEBBLES", "Marlina Bahena"));
        ListaSeries.add(new Serie("GUMDROPS", "Gabriela Zatain"));
        ListaSeries.add(new Serie("TIPPY TOES", "Rebecca Williams Salvador"));
        ListaSeries.add(new Serie("MY FIRST LETTERS AND SOUNDS", "Rachel Gonia - Rebecca Williams Salvador"));
        ListaSeries.add(new Serie("CRICKETS", "Annette Flavel - Isabel Moreno"));
        ListaSeries.add(new Serie("M@TH ADVENTURES", "Rebecca Lee Williams"));
        ListaSeries.add(new Serie("ABRACADABRA", "Lenore Cohen"));
        ListaSeries.add(new Serie("BEEP", "Brendan Dunne - Robin Newton"));
        ListaSeries.add(new Serie("COOL KIDS", "Gabriela Zapiain - Silvia Zapiain - Joep van der Werff - Andrew Starling - Jeanette Greenwell - Ana Foncerrada"));
        ListaSeries.add(new Serie("LIGHTHOUSE", "Michael Downie - David Gray - Juan M. Jimenez"));
        ListaSeries.add(new Serie("PATHWAY TO GRAMMAR", "Noelle Child"));
        ListaSeries.add(new Serie("PATHWAY TO LITERATURE", "Elizabeth Rodriguez - Stefania Villareal - Aaron Burkholder"));
        ListaSeries.add(new Serie("PATHWAY TO MATH", ""));
        ListaSeries.add(new Serie("PATHWAY TO SCIENCE", ""));
        ListaSeries.add(new Serie("SCIENCE AND GEOGRAPHY", ""));
        ListaSeries.add(new Serie("SKYROCKET", "Sarah Conway"));
        ListaSeries.add(new Serie("SPOTLIGHT", ""));
        ListaSeries.add(new Serie("Achievers", "Leanne Gray - Ken Wilson"));
        ListaSeries.add(new Serie("Awesome", "Carol Lethaby - Simon Brewster"));
        ListaSeries.add(new Serie("Combined Sciences", "Hina Hashmi - Bernice Richter"));
        ListaSeries.add(new Serie("English in Motion", "Robert Campbell - Gill Holley - Rob Metcalf"));
        ListaSeries.add(new Serie("Next Step", "Carol Lethaby - Simon Brewster"));
        ListaSeries.add(new Serie("Spotlight on Literature", ""));
        ListaSeries.add(new Serie("Stopwatch", "Simon Brewster - Viviane Kirmeliene and Alastair Lane"));
        ListaSeries.add(new Serie("American Big Picture", "Simon Brewster - Alastair Lane"));
        ListaSeries.add(new Serie("@Work", "Anna Cowper - James Greenan"));
        ListaSeries.add(new Serie("English ID", "Paul Seligson - Luis Otavio Barros"));
        ListaSeries.add(new Serie("Going Pro", "Simon Brewster - Alastair Lane"));
        ListaSeries.add(new Serie("Identities", "Paul Seligson - Luis Otavio Barros"));
        ListaSeries.add(new Serie("Richmond Mazes", "Alastair Lane - James Styring"));
        ListaSeries.add(new Serie("The Big Picture", "Ben Goldstein Ceri Jones"));
        ListaSeries.add(new Serie("BUSINESS Skills", ""));
        ListaSeries.add(new Serie("BUSINESS Theories", ""));
        ListaSeries.add(new Serie("English Grammar in Steps", "David Bolton - Noel Goodey"));
        ListaSeries.add(new Serie("Primary Methodology Handbook", ""));
        ListaSeries.add(new Serie("Richmond Compact Dictionary", ""));
        ListaSeries.add(new Serie("Richmond Mini Dictionary", ""));
        ListaSeries.add(new Serie("Richmond Pocket Dictionary", ""));
        ListaSeries.add(new Serie("An Introduction to Teaching English to Children", "Susan House"));
        ListaSeries.add(new Serie("Visual Grammar", "Jim Scrivener"));
        ListaSeries.add(new Serie("Richmond Vocabulary Builder", "Liz Walter"));
        ListaSeries.add(new Serie("DELTA'S Key to the Next Generation TOEFL Test", "Nancy Gallagher"));
        ListaSeries.add(new Serie("TARGET KET for Schools", "Sue Ireland - Joanna Kosta"));
        ListaSeries.add(new Serie("TARGET PET", "Sue Ireland - Joanna Kosta"));
        ListaSeries.add(new Serie("Richmond Practice Tests for Cambridge English: Advanced", ""));
        ListaSeries.add(new Serie("Richmond Practice Tests for Cambridge English: First", ""));
        ListaSeries.add(new Serie("Richmond Practice Tests for IELTS", ""));
        ListaSeries.add(new Serie("Pass the TOEIC Test: Introductory Course", "Miles Craven"));
        ListaSeries.add(new Serie("Richmond Practice Tests - Movers", ""));

    }

    @Override
    public int getGroupCount() {
        return parentRowList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return parentRowList.get(groupPosition).getChildList().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return parentRowList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return parentRowList.get(groupPosition).getChildList().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ParentRow parentRow = (ParentRow) getGroup(groupPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.parent_row, null);
        }

        TextView heading = (TextView) convertView.findViewById(R.id.parent_text);

        heading.setText(parentRow.getName().trim());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildRow childRow = (ChildRow) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater)
                    context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_row, null);
        }

        ImageView childIcon = (ImageView) convertView.findViewById(R.id.child_icon);
        childIcon.setImageResource(childRow.getIcon());

        final TextView childText = (TextView) convertView.findViewById(R.id.child_text);
        childText.setText(childRow.getText().trim());

        final View finalConvertView = convertView;
        childText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(childText.getText().equals("CUBBY HOUSE By Fanny Riva Palacio - Stefania Villareal")||
                        childText.getText().equals("PEBBLES By Marlina Bahena")||
                        childText.getText().equals("GUMDROPS By Gabriela Zatain")||
                        childText.getText().equals("TIPPY TOES By Rebecca Williams Salvador")||
                        childText.getText().equals("MY FIRST LETTERS AND SOUNDS By Rachel Gonia - Rebecca Williams Salvador")||
                        childText.getText().equals("CRICKETS By Annette Flavel - Isabel Moreno")||
                        childText.getText().equals("M@TH ADVENTURES By Rebecca Lee Williams"))
                {

                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }
                    Intent intent = new Intent(finalConvertView.getContext(), DetallesSerieActivity.class);
                    String myString = (String) childText.getText();
                    final String[] nombreSerie = myString.split(Pattern.quote(" By"));
                    intent.putExtra("titulo", nombreSerie[0].toString());
                    intent.putExtra("autor", autor);
                    finalConvertView.getContext().startActivity(intent);
                }

                else if(childText.getText().equals("ABRACADABRA By Lenore Cohen")||
                        childText.getText().equals("BEEP By Brendan Dunne - Robin Newton")||
                        childText.getText().equals("LIGHTHOUSE By Michael Downie - David Gray - Juan M. Jiménez")||
                        childText.getText().equals("PATHWAY TO GRAMMAR By Noelle Child")||
                        childText.getText().equals("PATHWAY TO LITERATURE By Elizabeth Rodriguez - Stefania Villarreal - Aaron Burkholder")||
                        childText.getText().equals("PATHWAY TO MATH")||
                        childText.getText().equals("PATHWAY TO SCIENCE")||
                        childText.getText().equals("SCIENCE AND GEOGRAPHY")||
                        childText.getText().equals("SKYROCKET By Sarah Conway")||
                        childText.getText().equals("SPOTLIGHT"))
                {
                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }

                    Intent intent = new Intent(finalConvertView.getContext(), DetallePrimaryActivity.class);
                    String myString = (String) childText.getText();
                    final String[] nombreSerie = myString.split(Pattern.quote(" By"));
                    Log.i("perrito", nombreSerie[0].toString());
                    intent.putExtra("titulo", nombreSerie[0].toString());
                    intent.putExtra("autor", autor);
                    finalConvertView.getContext().startActivity(intent);
                }

                else if(childText.getText().equals("Achievers")||
                        childText.getText().equals("Awesome")||
                        childText.getText().equals("Combined Sciences")||
                        childText.getText().equals("English in Motion")||
                        childText.getText().equals("Next Step")||
                        childText.getText().equals("Spotlight on Literature")||
                        childText.getText().equals("Stopwatch"))
                {

                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }

                    Intent intent = new Intent(finalConvertView.getContext(), DetalleSecondaryActivity.class);
                    intent.putExtra("autor", autor);
                    intent.putExtra("titulo", childText.getText());
                    finalConvertView.getContext().startActivity(intent);
                }

                else if(childText.getText().equals("American Big Picture")||
                        childText.getText().equals("@work")||
                        childText.getText().equals("English ID")||
                        childText.getText().equals("Going Pro")||
                        childText.getText().equals("Identities")||
                        childText.getText().equals("Richmond Mazes")||
                        childText.getText().equals("The big picture"))
                {

                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }

                    Intent intent = new Intent(finalConvertView.getContext(), DetalleYoungActivity.class);
                    intent.putExtra("autor", autor);
                    intent.putExtra("titulo", childText.getText());
                    finalConvertView.getContext().startActivity(intent);
                }

                else if(childText.getText().equals("BUSINESS Skills")||
                        childText.getText().equals("BUSINESS Theories")||
                        childText.getText().equals("English Grammar in Steps")||
                        childText.getText().equals("Primary Methodology Handbook")||
                        childText.getText().equals("Richmond Compact Dictionary")||
                        childText.getText().equals("Richmond Mini Dictionary")||
                        childText.getText().equals("Richmond Pocket Dictionary")||
                        childText.getText().equals("An Introduction to Teaching English to Children")||
                        childText.getText().equals("Visual Grammar")||
                        childText.getText().equals("Richmond Vocabulary Builder"))
                {

                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }

                    Toast.makeText(finalConvertView.getContext(), "Contenido no disponible", Toast.LENGTH_SHORT).show();

                    /*Intent intent = new Intent(finalConvertView.getContext(), DetalleSupplementaryActivity.class);
                    intent.putExtra("autor", autor);
                    intent.putExtra("titulo", childText.getText());
                    finalConvertView.getContext().startActivity(intent);*/
                }

                else if(childText.getText().equals("DELTA'S Key to the Next Generation TOELF Test")||
                        childText.getText().equals("TARGET KET for Schools")||
                        childText.getText().equals("TARGET PET")||
                        childText.getText().equals("Richmond Practice Tests for Cambridge English: Advanced")||
                        childText.getText().equals("Richmond Practice Tests for Cambridge English: First")||
                        childText.getText().equals("Richmond Practice Tests for IELTS")||
                        childText.getText().equals("Pass the TOEIC Test: Introductory Course")||
                        childText.getText().equals("Richmond Practice Tests - Movers"))
                {

                    for(int i = 0; i < ListaSeries.size(); i++)
                    {
                        if(childText.getText().equals(ListaSeries.get(i).titulo))
                        {
                            autor = ListaSeries.get(i).autor;
                        }
                    }

                    Toast.makeText(finalConvertView.getContext(), "Contenido no disponible", Toast.LENGTH_SHORT).show();
                    /*Intent intent = new Intent(finalConvertView.getContext(), DetalleExamsActivity.class);
                    intent.putExtra("autor", autor);
                    intent.putExtra("titulo", childText.getText());
                    finalConvertView.getContext().startActivity(intent);*/
                }
            }
        });

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public void filterData(String query) {
        query = query.toLowerCase();
        parentRowList.clear();

        if (query.isEmpty()) {
            parentRowList.addAll(originalList);
        }
        else {
            for (ParentRow parentRow : originalList) {
                ArrayList<ChildRow> childList = parentRow.getChildList();
                ArrayList<ChildRow> newList = new ArrayList<ChildRow>();

                for (ChildRow childRow: childList) {
                    if (childRow.getText().toLowerCase().contains(query)) {
                        newList.add(childRow);
                    }
                } // end for (com.example.user.searchviewexpandablelistview.ChildRow childRow: childList)
                if (newList.size() > 0) {
                    ParentRow nParentRow = new ParentRow(parentRow.getName(), newList);
                    parentRowList.add(nParentRow);
                }
            } // end or (com.example.user.searchviewexpandablelistview.ParentRow parentRow : originalList)
        } // end else

        notifyDataSetChanged();
    }
}
