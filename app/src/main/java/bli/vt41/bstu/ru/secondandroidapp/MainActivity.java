package bli.vt41.bstu.ru.secondandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем элемент ListView
        ListView listView = (ListView) findViewById(R.id.list_news);
        // создаем адаптер
        PostAdapter adapterListView = new PostAdapter(this, R.layout.item_news, getPosts());
        // устанавливаем для списка адаптер
        listView.setAdapter(adapterListView);
    }

    // набор данных, которые свяжем со списком
    private List<Post> getPosts(){
        List<Post> posts = new ArrayList<>();

        posts.add(
               new Post(
                        "Дурак, он и есть дурак!",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem1,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Полёт",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem2,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Шампусик",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem3,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Мемчик",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem4,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Утя",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem5,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Тёлочка с базукой",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem6,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Гонка",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem7,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Защита",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem8,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Теребонька",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem9,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        posts.add(
                new Post(
                        "Слава Путину!",
                        "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        R.drawable.mem10,
                        new Date(2018, 3, 16, 6, 6, 6)
                )
        );

        return posts;
    }
}
