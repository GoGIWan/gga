package com.example.a1818;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.ramotion.foldingcell.FoldingCell;

import java.util.HashSet;
import java.util.List;

/**
 * Simple example of ListAdapter for using with Folding Cell
 * Adapter holds indexes of unfolded elements for correct work with default reusable views behavior
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class FoldingCellListAdapter extends ArrayAdapter<Item> {

    private HashSet<Integer> unfoldedIndexes = new HashSet<>();
    private View.OnClickListener defaultRequestBtnClickListener;
    private ImageView image;

    public FoldingCellListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // get item for selected view
        Item item = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        FoldingCell cell = (FoldingCell) convertView;
        ViewHolder viewHolder;
        if (cell == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());
            cell = (FoldingCell) vi.inflate(R.layout.cell, parent, false);
            // binding view parts to view holder
            viewHolder.in_part = cell.findViewById(R.id.in_part);
            viewHolder.part = cell.findViewById(R.id.part_of_muscle);
            viewHolder.time = cell.findViewById(R.id.title_time_label);
            viewHolder.date = cell.findViewById(R.id.title_date_label);
            viewHolder.weight = cell.findViewById(R.id.title_weight);
            viewHolder.in_weight = cell.findViewById(R.id.in_weight);
            viewHolder.fatigue = cell.findViewById(R.id.fatigue);
            viewHolder.spend_time = cell.findViewById(R.id.spend_time);
            viewHolder.set_count = cell.findViewById(R.id.set_count);
            viewHolder.in_set_count = cell.findViewById(R.id.in_set_count);
            viewHolder.count = cell.findViewById(R.id.count_numberic);
            viewHolder.in_count = cell.findViewById(R.id.in_count);
            viewHolder.contentRequestBtn = cell.findViewById(R.id.content_request_btn);
            viewHolder.frist_routin = cell.findViewById(R.id.frist_routin);
            viewHolder.second_routin = cell.findViewById(R.id.second_routin);
            viewHolder.frist_routin_set = cell.findViewById(R.id.frist_routin_set);
            viewHolder.second_routin_set = cell.findViewById(R.id.second_routin_set);
            viewHolder.frist_routin_count = cell.findViewById(R.id.frist_routin_count);
            viewHolder.second_routin_count = cell.findViewById(R.id.second_routin_count);
//
//            for (int i = 1; i < 4; i++) {
//                int resId = getContext().getResources().getIdentifier("head_image", "id",com.example.a1818);
//                ((ImageView) cell.findViewById(R.id.head_image)).setImageResource(resId + i);
//
//            }





            cell.setTag(viewHolder);
        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true);
            } else {
                cell.fold(true);
            }
            viewHolder = (ViewHolder) cell.getTag();
        }

        if (null == item)
            return cell;

        // bind data from selected element to view through view holder
        viewHolder.part.setText(item.getPart());
//        viewHolder.image.setText(item.getImage());
        viewHolder.frist_routin.setText(item.getFrist_routin());
        viewHolder.second_routin.setText(item.getSecond_routin());
        viewHolder.in_part.setText(item.getIn_part());
        viewHolder.time.setText(item.getTime());
        viewHolder.date.setText(item.getDate());
        viewHolder.weight.setText(String.valueOf(item.getWeight()));
        viewHolder.in_weight.setText(String.valueOf(item.getIn_weight()));
        viewHolder.fatigue.setText(String.valueOf(item.getFatigue()));
        viewHolder.count.setText(String.valueOf(item.getCount()));
        viewHolder.in_count.setText(String.valueOf(item.getIn_count()));
        viewHolder.spend_time.setText(String.valueOf(item.getSpend_time()));
        viewHolder.set_count.setText(String.valueOf(item.getSet_count()));
        viewHolder.in_set_count.setText(String.valueOf(item.getIn_set_count()));
        viewHolder.frist_routin_set.setText(String.valueOf(item.getFrist_routin_set()));
        viewHolder.second_routin_set.setText(String.valueOf(item.getSecond_routin_set()));
        viewHolder.frist_routin_count.setText(String.valueOf(item.getFrist_routin_count()));
        viewHolder.second_routin_count.setText(String.valueOf(item.getSecond_routin_count()));

        // set custom btn handler for list item from that item
        if (item.getRequestBtnClickListener() != null) {
            viewHolder.contentRequestBtn.setOnClickListener(item.getRequestBtnClickListener());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.contentRequestBtn.setOnClickListener(defaultRequestBtnClickListener);
        }

        return cell;
    }



    // simple methods for register cell state changes
    public void registerToggle(int position) {
        if (unfoldedIndexes.contains(position))
            registerFold(position);
        else
            registerUnfold(position);
    }

    public void registerFold(int position) {
        unfoldedIndexes.remove(position);
    }

    public void registerUnfold(int position) {
        unfoldedIndexes.add(position);
    }

    public View.OnClickListener getDefaultRequestBtnClickListener() {
        return defaultRequestBtnClickListener;
    }

    public void setDefaultRequestBtnClickListener(View.OnClickListener defaultRequestBtnClickListener) {
        this.defaultRequestBtnClickListener = defaultRequestBtnClickListener;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView part;
        TextView in_part;
        TextView contentRequestBtn;
        TextView set_count;
        TextView in_set_count;
        TextView spend_time;
        TextView weight;
        TextView in_weight;
        TextView fatigue;
        TextView count;
        TextView in_count;
        TextView date;
        TextView frist_routin;
        TextView second_routin;
        TextView frist_routin_set;
        TextView time;
        TextView second_routin_set;
        TextView frist_routin_count;
        TextView second_routin_count;
        TextView image;

    }
}
